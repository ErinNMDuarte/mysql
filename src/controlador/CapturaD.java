package controlador;

import java.util.ArrayList;
import modelo.Usuario;
import modelo.UsuarioCrud;

public class CapturaD {

    UsuarioCrud usucrud = new UsuarioCrud();
    Usuario us;

    public void capturaDatos(String nombre, String apellidos, String fechan, String correoI, String correoP, String programaA, Long ntCelular, Long ntFijo) {
        us = new Usuario(nombre, apellidos, fechan, correoI, correoP, ntCelular, ntFijo, programaA);
        usucrud.ingresar(us);
       

    }

    public ArrayList<Usuario> buscarDato (String corri){
        us =new Usuario(corri);
        return usucrud.buscar(us);
    }

    public void modificardato(String correoI, String correoP, Long ntCelular, Long ntFijo,String programaA) {
        us = new Usuario(correoI, correoP, ntCelular, ntFijo, programaA);
        usucrud.modificar(us);

    }

    public void eliminardato(String corri) {
        us =new Usuario(corri);
        usucrud.eliminar(us);
                
    }
    public ArrayList<Usuario>consultarDatos() {
        return usucrud.consultar();
    }

}
