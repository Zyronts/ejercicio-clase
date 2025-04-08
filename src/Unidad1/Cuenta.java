package Unidad1;
public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad, int semanas) {
        for (int i = 0; i < semanas; i++) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                System.out.println("Saldo insuficiente para retirar en la semana " + (i + 1));
                break;
            }
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000.0);
        cuenta.retirar(200.0, 4);
        System.out.println("El saldo restante en la cuenta al final del mes es: $" + cuenta.obtenerSaldo());
    }
}