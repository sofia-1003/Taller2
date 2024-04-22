public class CuentaBancaria {

    private int numeroDeCuenta;
    private double saldo;
    private String titular;
    private String tipoDeCuenta;
    private double saldoFinal;

    public CuentaBancaria(int numeroDeCuenta, double saldo, String titular, String tipoDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public double retirarSaldo(double retiro){
        if(saldo > 0.0){
            saldoFinal = saldo - retiro;
        }
        return saldoFinal;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void informacionCuenta(){
        System.out.println("Información de la cuenta bancaria: ");
        System.out.println("Nombre del titular: " + getTitular());
        System.out.println("Número de cuenta: " + getNumeroDeCuenta());
        System.out.println("Tipo de cuenta: " + getTipoDeCuenta());
        System.out.println("Saldo: " + getSaldo());
}

}