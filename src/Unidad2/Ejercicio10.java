package Unidad2;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] sumaFilas = new int[5];
        int[] sumaColumnas = new int[5];

        System.out.println("Introduce los valores de la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += matriz[i][j]; 
                sumaColumnas[j] += matriz[i][j]; 
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumaColumnas[j]);
        }

        input.close();
    }
}