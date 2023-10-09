public class Alumno{
    private String nombre;
    private int matricula;
    private char grupo;
    private int grado;

    public Alumno(){
        nombre = "";
        matricula = 0;
        grupo = '';
        grado = 0;
    }
    /*Le pasamos los parametros va a asignar todos esos valores por defecto, sin necesidad de llamar cada set*/
    public Alumno(String n, int m, char g, int gg){
        nombre = n;
        matricula = m;
        grupo = g;
        grado = gg;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
        public String getnombre(){
            return nombre;
        }

    public void setmatricula(int matricula){
        this.matricula=matricula;
    }
        public int getMatricula(){
            return matricula;
        }

    public void setGrupo(char grupo){
        this.grupo=grupo;
    }
        public char getGrupo(){
            return grupo;
        }

    public void setGrado(int grado){
        this.grado=grado;
    }
        public int getGrado(){
            return grado;
        }
}