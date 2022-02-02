package controlador;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    Connection cnn;

    public Connection conexionjbdc() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JOptionPane.showMessageDialog(null, "Conexion ok");
        } catch (ClassNotFoundException ex) {
            System.err.println("error en diver" + ex);
        }
        try {
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/datos_estudiantes", "root", "");
        } catch (SQLException ex) {
            System.err.println("error en url" + ex);
        }

        return cnn;
    }

    public static void main(String[] arg) {
        Conexion con = new Conexion();
        con.conexionjbdc();
    }
}
