package Unidad1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Realizar un programa que solicite la carga por teclado de dos números//
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero 1: ");
        float numero1 = input.nextFloat();
        System.out.println("Ingresa el numero 2: ");
        float numero2 = input.nextFloat ();

        //si el primero es mayor al segundo informar su suma y diferencia//

        if (numero1 > numero2) {
            float resultadoSum = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultadoSum);
            float resultadoDif = numero1 - numero2;
            System.out.println("El resultado de la diferencia es: " + resultadoDif);
            
        } 

        //en caso contrario informar el producto y la división// 

        else  {
            float resultadoProd = numero1 * numero2;
            System.out.println("El resultado del producto es: " + resultadoProd);
            float resultadoDivi = numero1 / numero2;
            System.out.println("El resultado de la division es: " + resultadoDivi);
        }
        input.close();
    }
    
}