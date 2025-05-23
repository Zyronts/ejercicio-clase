package Unidad2;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int partidos = 15;

        String[][] equipos = new String[partidos][2];
        int[][] resultados = new int[partidos][2];

        System.out.println("Introduce los nombres de los equipos de los 15 partidos:");
        for (int i = 0; i < partidos; i++) {
            System.out.print("Partido " + (i + 1) + " - Equipo 1: ");
            equipos[i][0] = input.nextLine();
            System.out.print("Partido " + (i + 1) + " - Equipo 2: ");
            equipos[i][1] = input.nextLine();
        }

        System.out.println("\nIntroduce los resultados de los partidos:");
        for (int i = 0; i < partidos; i++) {
            System.out.println("Partido " + (i + 1) + ": " + equipos[i][0] + " vs " + equipos[i][1]);
            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = input.nextInt();
            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = input.nextInt();
        }

        System.out.println("\nResultados de la quiniela:");
        for (int i = 0; i < partidos; i++) {
            System.out.println(equipos[i][0] + " " + resultados[i][0] + " - " + resultados[i][1] + " " + equipos[i][1]);
        }

        input.close();
    }
}