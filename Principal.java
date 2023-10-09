import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        /*Tamaño del arreglo */
        Alumno a[] = new Alumno[2];
    
        String nombre=" ";
        int matricula= 0;
        char grupo=' ';
        int grado= 0;

        for(int i=0;i<a.length;i++){
            System.out.println("Ingresa tu Nombre");
            nombre = leer.nextLine();
            System.out.println("Ingresa tu Matricula");
            matricula = leer.nextInt();
            System.out.println("Ingresa tu Grupo");
            grupo = leer.next().charAt(0);
            System.out.println("Ingresa tu Grado");
            grado = leer.nextInt();
            leer.nextLine();

           // a[i] = new Alumno(nombre,matricula,grupo,grado);
        }
        /* 
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].getNombre()+" "+a[i].getMatricula()+" "+a[i].getGrupo()+" "+a[i].getGrado());
        }
        */
    }
    /* 
    String arreglo[]= new String [10];
    int numero[]= new int[10];
    */
}
