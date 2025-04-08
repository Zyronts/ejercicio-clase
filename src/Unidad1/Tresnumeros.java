package Unidad1;
import java.util.Scanner;

public class Tresnumeros {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Introduce el primer número:");
    int numero1 = scanner.nextInt();

    System.out.println("Introduce el segundo número:");
    int numero2 = scanner.nextInt();

    System.out.println("Introduce el tercer número:");
    int numero3 = scanner.nextInt();

    if (numero1 > numero2 && numero1 > numero3)
     {System.out.println("El mayor es el numero 1: " + numero1);
    } else if (numero2 > numero1 && numero2 > numero3) {
        System.out.println("El mayor es el numero 2: " + numero2);  
    } else  {
        System.out.println("El mayor es el numero 3: " + numero3);
    }

    scanner.close();

}
 }