package Unidad1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el numero");
        int numero = input.nextInt();

        if (numero >=1 && numero <= 99) {
            if (numero < 10) {
                System.out.println("El numero es de un digito: " + numero);
                
            }
            else  {
                System.out.println("El numero tiene dos: " + numero);
            }
            
        }

        else {
            System.out.println("El numero esta fuera del rango establecido");
        }
        input.close();
    }
    
}
