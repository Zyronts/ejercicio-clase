import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese las tres notas del alumno");
        float nota1 = input.nextFloat();
        float nota2 = input.nextFloat();
        float nota3 = input.nextFloat();

        //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete//

        float promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 7) {
            System.out.println("El promedio es: " + promedio + " Promocionado");
        }
        input.close();
    }
    
}
