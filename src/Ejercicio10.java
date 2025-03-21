import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el sueldo y antiguedad");
        float sueldo = input.nextFloat();
        int antiguedadAños = input.nextInt();

        if ( sueldo < 500 && antiguedadAños >= 10) {
            float sueldoFinal = sueldo + (sueldo * 0.20f);
            System.out.println("El sueldo final es: " + sueldoFinal);
        } else if (sueldo < 500 && antiguedadAños < 10) {
            float sueldoFinal = sueldo + (sueldo * 0.05f);
            System.out.println("El sueldo final es: " + sueldoFinal);
        }
        else if (sueldo >= 500) {
            System.out.println("El sueldo no tiene descuento: " + sueldo);
        }
        input.close();
    }
}
