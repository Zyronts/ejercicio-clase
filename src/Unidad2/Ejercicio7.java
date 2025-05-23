package Unidad2;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Introduce 5 valores para el primer vector:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = input.nextInt();
        }

        System.out.println("\nIntroduce 5 valores para el segundo vector:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = input.nextInt();
        }

        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("\nResultado de la suma (vector3):");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("vector3[" + i + "] = " + vector3[i]);
        }

        input.close();
    }
}