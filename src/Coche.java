import java.time.LocalDate;

public class Coche {

    private String marca;
    private String modelo;
    private int anio;
    private int precio;
    private double valorFinal;



    public Coche(String marca, String modelo, int anio, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int depreciacionCarro(int anioFabricacion, int precio){
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        int aniosUso = anioActual - anioFabricacion;

        if(aniosUso > 0){
            valorFinal = precio * (0.1 * aniosUso);
            return precio -(int) valorFinal;
        }else
            return precio;
    }

    public void informacionCarro(){
        System.out.println("Información del carro: ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
    }


}