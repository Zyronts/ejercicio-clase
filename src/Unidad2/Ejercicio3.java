package Unidad2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas_alumno = new float[5];

        System.out.println("Introduce las notas de 5 alumnos:");
        for (int i = 0; i < notas_alumno.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas_alumno[i] = input.nextFloat();

            if (notas_alumno[i] >= 0 && notas_alumno[i] <= 10) {
                System.out.println("Nota correcta.");
            } else {
                System.out.println("Nota incorrecta. Debe estar entre 0 y 10.");
            }

            float suma = 0; float nota_media = 0; float nota_maxima = notas_alumno[0]; float nota_minima = notas_alumno[0];
            for (float nota : notas_alumno) {
                suma += nota;
                if (nota > nota_maxima) {
                    nota_maxima = nota;
                }
                if (nota < nota_minima) {
                    nota_minima = nota;
                }
            }
            nota_media = suma / notas_alumno.length;

           
            System.out.println("La nota máxima es: " + nota_maxima);
            System.out.println("La nota mínima es: " + nota_minima);
            System.out.println("La nota media es: " + nota_media);
        }

        input.close();
    }
}
