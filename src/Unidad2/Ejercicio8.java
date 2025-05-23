package Unidad2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        while (true) {
            System.out.print("Introduce el nombre del alumno (* para terminar): ");
            String nombre = input.nextLine();
            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = input.nextInt();
            input.nextLine(); 

            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        if (!edades.isEmpty()) {
            int maxEdad = edades.get(0);
            ArrayList<String> mayores = new ArrayList<>();

            for (int i = 0; i < edades.size(); i++) {
                if (edades.get(i) > maxEdad) {
                    maxEdad = edades.get(i);
                    mayores.clear();
                    mayores.add(nombres.get(i));
                } else if (edades.get(i) == maxEdad) {
                    mayores.add(nombres.get(i));
                }
            }

            System.out.println("\nAlumno(s) con más edad (" + maxEdad + " años):");
            for (String mayor : mayores) {
                System.out.println(mayor);
            }
        }

        input.close();
    }
}