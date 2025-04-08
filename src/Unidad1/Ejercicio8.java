package Unidad1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Ingrese la cantidad total de preguntas");
        int totalPreguntas = input.nextInt();
        System.out.println("Ingrese la cantidad de preguntas correctas");
        int preguntasCorrectas = input.nextInt();

        float porcentaje = (float) preguntasCorrectas / totalPreguntas * 100;

        if (porcentaje >= 90) {
            System.out.println("Nivel maximo");
        } else if (porcentaje >= 75 && porcentaje < 90) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50 && porcentaje < 75) {
            System.out.println("Nivel regular");
        } else if (porcentaje <= 50) {
            System.out.println("Fuera de nivel");
        }

    input.close();
    }
}
