package vista;

import controlador.CapturaD;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Usuario;


public class VistaU {

    ArrayList<Usuario> lista = new ArrayList<>();
    
    Scanner cap = new Scanner(System.in);
    CapturaD cd = new CapturaD();
    ArrayList<Usuario> datos = new ArrayList<>();
    Usuario us = new Usuario();
    int dato, c;
    String nombre, apellidos, fechan, correoI, correoP, programaA, corri;
    Long ntCelular, ntFijo;

    public VistaU() {
        
    }

    public void menuprincipal() {

        do {
            String menu = "INSTITUTO LA FLORESTA\n"
                    + "Seleccione tarea a realizar:\n"
                    + "1. Ingresar estudiante\n"
                    + "2. Buscar estudiante\n"
                    + "3. Modificar estudiante\n"
                    + "4. Eliminar Estudiante\n"
                    + "5. Ver directorio de estudiantes\n"
                    + "6. Salir\n"
                    + "Opción:\n";
                    
            System.out.println(menu);
            try {
                dato = cap.nextInt();
            } catch (Exception e) {
                dato = 0;
            }
            switch (dato) {
                case 1:
                    System.out.print("\n");
                    System.out.println("Ingresar estudiante");
                    cap.nextLine();
                    System.out.print("Ingresar nombres:\n");
                    System.out.print("\n");
                    nombre = cap.nextLine();
                    System.out.print("Ingresar apellidos:\n");
                    System.out.print("\n");
                    apellidos = cap.nextLine();
                    System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):\n");
                    fechan = cap.next();
                    System.out.println("Ingresar correo institucional:\n");
                    correoI = cap.next();
                    System.out.println("Ingresar correo personal:\n");
                    correoP = cap.next();
                    System.out.println("Ingresar número de celular:\n");
                    ntCelular = cap.nextLong();
                    cap.nextLine();
                    System.out.println("Ingresar número fijo:\n");
                    ntFijo = Long.parseLong(cap.nextLine());

                    System.out.println("Ingresar programa:\n");
                    programaA = cap.nextLine();

                    cd.capturaDatos(nombre, apellidos, fechan, correoI, correoP, programaA, ntCelular, ntFijo);

                    System.out.println("Se agregó el estudiante\n");
                    break;
                case 2:
                    System.out.print("\n");
                    System.out.println("Buscar estudiante");
                    System.out.print("Ingresar correo institucional:\n");
                    System.out.print("\n");
                    corri = cap.next();
                    System.out.print("\n");
                    System.out.print("Información del estudiante\n");
                    datos = cd.buscarDato(corri);
                    for (int i=0; i<datos.size();i++){
                        us=datos.get(i);
                    System.out.println("Nombres: " + us.getNombre1()
                            + "\nApellidos: " + us.getApellidos1()
                            + "\nFecha nacimiento: " + us.getFechaN()
                            + "\nCorreo institucional: " + us.getCorreoi()
                            + "\nCorreo personal: " + us.getCorreop()
                            + "\nNúmero de teléfono celular: " + us.getNtcelular()
                            + "\nNúmero de teléfono fijo: " + us.getNtfijo()
                            + "\nPrograma académico: " + us.getProgramaa());
                    System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.print("\n");
                    System.out.println("Modificar estudiante");
                    System.out.print("Ingresar correo institucional:\n");
                    System.out.print("\n");
                    correoI = cap.next();
                    System.out.print("Ingresar correo personal:\n");
                    System.out.print("\n");
                    correoP = cap.next();
                    System.out.print("Ingresar número de celular:");
                    System.out.print("\n");
                    ntCelular = cap.nextLong();
                    System.out.print("Ingresar número fijo:");
                    System.out.print("\n");
                    ntFijo = cap.nextLong();
                    System.out.print("Ingresar programa:");
                    System.out.print("\n");
                    programaA = cap.next();
                    cd.modificardato(correoI, correoP, ntCelular, ntFijo, programaA);
                    System.out.print("Se modificó el estudiante \n");
                    System.out.print("\n");
                    break;

                case 4:
                    System.out.print("\n");
                    System.out.println("Eliminar estudiante");
                    System.out.print("Ingresar correo institucional:\n");
                    System.out.print("\n");
                    corri = cap.next();
                    cd.eliminardato(corri);
                    System.out.print("Se eliminó el estudiante\n");
                    System.out.print("\n");
                    break;

                case 5:
                    System.out.print("\n");
                    System.out.println("El directorio de los estudiantes\n");
                    datos = cd.consultarDatos();
                    for (Usuario us : datos) {
                        System.out.print(us);
                        System.out.print("\n");
                    }
                    break;
            }
        } while (dato != 6);
        System.out.print("\n");
        System.out.println("Hasta pronto");

    }

}
