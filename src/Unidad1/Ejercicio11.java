package Unidad1;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las diez notas del alumno:");
        float nota1 = input.nextFloat();
        float nota2 = input.nextFloat();
        float nota3 = input.nextFloat();
        float nota4 = input.nextFloat();
        float nota5 = input.nextFloat();
        float nota6 = input.nextFloat();
        float nota7 = input.nextFloat();
        float nota8 = input.nextFloat();
        float nota9 = input.nextFloat();
        float nota10 = input.nextFloat();


        if (nota1 > 7 || nota2 > 7 || nota3 > 7 || nota4 > 7 || nota5 > 7 || 
            nota6 > 7 || nota7 > 7 || nota8 > 7 || nota9 > 7 || nota10 > 7) {
            System.out.println("Notas mayores a 7:");
            if (nota1 > 7) System.out.println("Nota 1: " + nota1);
            if (nota2 > 7) System.out.println("Nota 2: " + nota2);
            if (nota3 > 7) System.out.println("Nota 3: " + nota3);
            if (nota4 > 7) System.out.println("Nota 4: " + nota4);
            if (nota5 > 7) System.out.println("Nota 5: " + nota5);
            if (nota6 > 7) System.out.println("Nota 6: " + nota6);
            if (nota7 > 7) System.out.println("Nota 7: " + nota7);
            if (nota8 > 7) System.out.println("Nota 8: " + nota8);
            if (nota9 > 7) System.out.println("Nota 9: " + nota9);
            if (nota10 > 7) System.out.println("Nota 10: " + nota10);
        } else {
            System.out.println("Todas las notas son menores o iguales a 7.");
        }

        input.close();
    }
}