package Unidad2;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias = 5;
        float[] tempMin = new float[dias];
        float[] tempMax = new float[dias];

        System.out.println("Introduce las temperaturas mínimas y máximas de " + dias + " días:");
        for (int i = 0; i < dias; i++) {
            System.out.print("Día " + (i + 1) + " - Mínima: ");
            tempMin[i] = input.nextFloat();
            System.out.print("Día " + (i + 1) + " - Máxima: ");
            tempMax[i] = input.nextFloat();
        }

        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < dias; i++) {
            float media = (tempMin[i] + tempMax[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media + "°C");
        }

        float minGlobal = tempMin[0];
        for (float temp : tempMin) {
            if (temp < minGlobal) {
                minGlobal = temp;
            }
        }

        System.out.println("\nDías con la menor temperatura mínima (" + minGlobal + "°C):");
        for (int i = 0; i < dias; i++) {
            if (tempMin[i] == minGlobal) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("\nIntroduce una temperatura máxima para buscar: ");
        float tempBusqueda = input.nextFloat();
        boolean encontrado = false;

        System.out.println("Días con temperatura máxima de " + tempBusqueda + "°C:");
        for (int i = 0; i < dias; i++) {
            if (tempMax[i] == tempBusqueda) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay ningún día con esa temperatura máxima.");
        }

        input.close();
    }
}