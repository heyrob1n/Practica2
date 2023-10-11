import java.util.Scanner;

class Alumno {
    String nombre;
    String matricula;
    String correo;
    String telefono;
    String promedio;

    public void setNombre(String nom) {
        nombre = nom;
    }
        public String getNombre() {
            return nombre;
        }

    public void setMatricula(String mat) {
        matricula = mat;
    }
        public String getMatricula() {
            return matricula;
        }

    public void setCorreo(String cor) {
        correo = cor;
    }
        public String getCorreo() {
            return correo;
        }

    public void setTelefono(String tel) {
        telefono = tel;
    }
        public String getTelefono() {
            return telefono;
        }

    public void setPromedio(String prom) {
        promedio = prom;
    }
        public String getPromedio() {
            return promedio;
        }
}

public class Practica2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = Integer.parseInt(scan.nextLine());

        if (cantidadAlumnos <= 1) {
            System.out.println("El tamaño del arreglo debe ser mayor que uno.");
            scan.close();
            return;
        }

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno alumno = new Alumno();

            System.out.println("\nIngrese los datos para el alumno " + (i + 1) + ":");

                System.out.println("Nombre del alumno: ");
                String nombre = scan.nextLine();
                alumno.setNombre(nombre);

                    System.out.println("Matricula: ");
                    String matricula = scan.nextLine();
                    alumno.setMatricula(matricula);

                        System.out.println("Correo: ");
                        String correo = scan.nextLine();
                        alumno.setCorreo(correo);

                            System.out.println("Telefono: ");
                            String telefono = scan.nextLine();
                            alumno.setTelefono(telefono);

                                System.out.println("Promedio: ");
                                String promedio = scan.nextLine();
                                alumno.setPromedio(promedio);

            alumnos[i] = alumno;
        }

        System.out.println("\nDatos de los alumnos:");

        for (Alumno alumno : alumnos) {
            System.out.println("\nNombre del alumno: " + alumno.getNombre());
            System.out.println("Matricula: " + alumno.getMatricula());
            System.out.println("Correo: " + alumno.getCorreo());
            System.out.println("Telefono: " + alumno.getTelefono());
            System.out.println("Promedio: " + alumno.getPromedio());
        }

        scan.close();
    }
}