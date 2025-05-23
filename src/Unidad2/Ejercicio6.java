package Unidad2;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Introduce un número de mes (1-12): ");
        int numeroMes = input.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("El mes es " + meses[numeroMes - 1] + " y tiene " + dias[numeroMes - 1] + " días.");
        } else {
            System.out.println("Número de mes no válido. Debe ser entre 1 y 12.");
        }

        input.close();
    }
}