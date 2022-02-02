package modelo;

import controlador.Conexion;
import java.util.ArrayList;
import java.sql.*;

public class UsuarioCrud {

    Conexion con = new Conexion();
    Connection cnn = con.conexionjbdc();
    PreparedStatement ps;
    ResultSet rs;

    Usuario us;

    public void ingresar(Usuario us) {

        try {

            ps = cnn.prepareStatement("INSERT INTO estudiantes Values(?,?,?,?,?,?,?,?)");
            ps.setString(1, us.getNombre1());
            ps.setString(2, us.getApellidos1());
            ps.setString(3, us.getFechaN());
            ps.setString(4, us.getCorreoi());
            ps.setString(5, us.getCorreop());
            ps.setLong(6, us.getNtcelular());
            ps.setLong(7, us.getNtfijo());
            ps.setString(8, us.getProgramaa());
            ps.executeUpdate();

        } catch (SQLException ex) {

            System.out.print("error en ingresar" + ex);
        }

    }

    public ArrayList<Usuario> buscar(Usuario us) {
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("SELECT * FROM estudiantes WHERE CorreoI='" + us.getCorreoi() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                us = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getLong(6), rs.getLong(7),
                        rs.getString(8));
                lista.add(us);
            }
            
        } catch (SQLException ex) {
        }
        return lista;

    }

    public void modificar(Usuario us) {

        try {
            ps = cnn.prepareStatement("UPDATE estudiantes Set CorreoP='" + us.getCorreop() + "', "
                    + "NumeroC='" + us.getNtcelular() + "',NumeroF='" + us.getNtfijo() + "',"
                    + "ProgramaA='" + us.getProgramaa() + "'"
                    + "WHERE CorreoI='" + us.getCorreoi() + "'");
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.print("error en modoficar" + ex);
        }

    }

    public void eliminar(Usuario us) {
        try {
            ps = cnn.prepareStatement("DELETE FROM estudiantes WHERE CorreoI='" + us.getCorreoi() + "'");
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.print("error en eliminar" + ex);
        }

    }

    public ArrayList<Usuario> consultar() {
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("SELECT * FROM estudiantes");
            rs = ps.executeQuery();
            while (rs.next()) {
                us = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getLong(6), rs.getLong(7),
                        rs.getString(8));
                lista.add(us);

            }
        } catch (SQLException ex) {
            System.out.print("error en consultar" + ex);
        }

        return lista;
    }

}
