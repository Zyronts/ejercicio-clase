package Unidad2;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] vector_numeros = new String[5];

        System.out.println("Introduce 5 palabras");
        for (int i = 0; i < vector_numeros.length; i++) {
            System.out.println("Palabra" + (i+1) + ": ");
            vector_numeros[i] = input.nextLine();
        }

        String vector_invertido[] = new String[vector_numeros.length];
        for (int i = 0; i < vector_invertido.length; i++) {
            vector_invertido[i] = vector_numeros[vector_numeros.length - 1 - i];
        }

    System.out.println("\nPalabras orden original:");
        for (String palabra : vector_numeros) {
            System.out.print(palabra + " ");
        }
        System.out.println("\nPalabras orden invertido:");
        for (String palabra : vector_invertido) {
            System.out.print(palabra + " ");
        }

        input.close();
    }
    
}
