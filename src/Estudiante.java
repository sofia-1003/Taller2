public class Estudiante {

    private String nombre;
    private int edad;
    private String curso;
    private double nota;

    public Estudiante(String nombre, int edad, String curso, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void imprimirDetalles() {
        System.out.println("Detalles del estudiante:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Curso: " + this.curso);
        System.out.println("Nota: " + this.nota);
}


}