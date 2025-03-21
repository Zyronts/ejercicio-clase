import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese los dos numeros");
        int numero1 = input.nextInt ();
        int numero2 = input.nextInt ();

        if (numero1 != numero2) {
            if (numero1 > numero2) {
                System.out.println("El numero mayor es: " + numero1);
            }
            else {
                System.out.println("El numero mayor es: " + numero2);
            }
        }
        else {
            System.out.println("Los numeros son iguales");
            
        }

        input.close();
        
    }
}