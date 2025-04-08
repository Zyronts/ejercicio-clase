package Unidad1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el numero");
        int numero = input.nextInt();

        if (numero >= 1) {
            System.out.println("El numero es positivo");
        }

        else {
            System.out.println("El numero es negativo o cero");
        }
        input.close();
    }
    
}
