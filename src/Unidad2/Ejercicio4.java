package Unidad2;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[10]; 
        int contador = 0; 

        System.out.println("Introduce números enteros (negativo para detener):");

        while (contador < vector.length) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = input.nextInt();

            if (numero < 0) {
                break; 
            }

            vector[contador] = numero;
            contador++;
        }

        System.out.println("\nValores introducidos:");
        for (int i = 0; i < contador; i++) {
            System.out.print(vector[i] + " ");
        }

        input.close();
    }
}