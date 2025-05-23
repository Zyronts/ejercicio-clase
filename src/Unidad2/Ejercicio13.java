package Unidad2;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conductores = 3;
        int dias = 7;

        String[] nombres = new String[conductores];
        int[][] kms = new int[conductores][dias];
        int[] total_kms = new int[conductores];

        System.out.println("Introduce los nombres de los conductores:");
        for (int i = 0; i < conductores; i++) {
            System.out.print("Nombre del conductor " + (i + 1) + ": ");
            nombres[i] = input.nextLine();
        }

        System.out.println("\nIntroduce los kilómetros recorridos cada día:");
        for (int i = 0; i < conductores; i++) {
            System.out.println("Conductor: " + nombres[i]);
            for (int j = 0; j < dias; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                kms[i][j] = input.nextInt();
                total_kms[i] += kms[i][j];
            }
        }


        System.out.println("\nKilómetros totales por conductor:");
        for (int i = 0; i < conductores; i++) {
            System.out.println(nombres[i] + " ha recorrido " + total_kms[i] + " km en la semana.");
        }

        input.close();
    }
}