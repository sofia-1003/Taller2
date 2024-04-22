import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Objetos de clase Estudiante*/
        Estudiante estudiante1 = new Estudiante("Juan", 20, "Informática", 8.5);
        estudiante1.imprimirDetalles();
        estudiante1.setNombre("Pedro");
        System.out.println("Nuevo nombre del estudiante: " + estudiante1.getNombre());
        Estudiante estudiante2 = new Estudiante("Sofia",21,"POO",5);
        estudiante2.imprimirDetalles();

        System.out.println();

        /*Objetos de clase Libro*/
        Libro libro1 = new Libro("100 años de soledad", "Gabriel García Márquez", 1967, 120000.00);
        Libro libro2 = new Libro("La Metamorfosis", "Franz Kafka", 1915, 30000.00);
        libro1.showInformation();
        libro2.showInformation();

        System.out.println();

        /*Objetos de clase Empleado*/
        Empleado empleado1 = new Empleado("Juan Quintero", "Big Data", 1000.00, 27233);
        Empleado empleado2 = new Empleado("Sofia Clavijo", "Software Development", 10000.00, 1003);
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();

        System.out.println();

        /*Objetos de clase CuentaBancaria*/
        CuentaBancaria cuenta1 = new CuentaBancaria(123,15000.00,"Sofía Clavijo","Cuenta de Ahorros");
        cuenta1.informacionCuenta();
        cuenta1.retirarSaldo(5000.00);
        System.out.println("Nuevo saldo después del retiro: " + cuenta1.getSaldoFinal());

        CuentaBancaria cuenta2 = new CuentaBancaria(456,20000.00,"Juan Quintero","Cuenta Corriente");
        cuenta2.informacionCuenta();
        cuenta2.retirarSaldo(15000.00);
        System.out.println("Nuevo saldo después del retiro: " + cuenta2.getSaldoFinal());

        System.out.println();

        /*Objetos de tipo vehículo*/
        Coche carro1 = new Coche("Wolkswagen", "Polo", 2022,50000000);
        carro1.informacionCarro();
        System.out.println("Para conocer la depreciación de su vehículo por favor inserte los siguientes datos: ");
        System.out.print("Año de fabricación: ");
        Scanner sc = new Scanner(System.in);
        int anioFabricacion = sc.nextInt();
        carro1.setAnio(anioFabricacion);
        System.out.print("Precio: ");
        int precio = sc.nextInt();
        carro1.setPrecio(precio);
        System.out.println("El valor de su vehículo después de depreciación es de: " + carro1.depreciacionCarro(anioFabricacion,precio));


        // Crear un objeto Rectangulo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese el alto del rectángulo: ");
        double alto = scanner.nextDouble();
        Rectangulo miRectangulo = new Rectangulo(ancho,alto);
        // Imprimir información sobre el rectángulo
        miRectangulo.imprimirInformacion();
        if (miRectangulo.esCuadrado()) {
            System.out.println("El rectángulo es un cuadrado.");
        } else {
            System.out.println("El rectángulo no es un cuadrado.");
        }
    }
}




