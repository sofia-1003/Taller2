public class Empleado {

    private String nombreEmpleado;
    private String departamento;
    private double salario;
    private double salarioAnual;
    private int id;

    public Empleado(String nombreEmpleado, String departamento, double salario,  int id) {
        this.nombreEmpleado = nombreEmpleado;
        this.departamento = departamento;
        this.salario = salario;
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double salarioAnual(double salario){
        if(salario > 0.0){
            salarioAnual = salario * 12;
        }
        return salarioAnual;
    }

    public void mostrarInformacion(){
        System.out.println("Información del empleado: ");
        System.out.println("Nombre: " + getNombreEmpleado());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salario: " + getSalario());
        System.out.println("Id: " + getId());
        System.out.println("Salario Anual: " + salarioAnual(salario));
}


}