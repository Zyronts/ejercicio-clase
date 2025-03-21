import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese los nombres");
        String nombre1 = input.nextLine();
        String nombre2 = input.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println("Orden alfabetico: " + nombre1 + ", " + nombre2);
        }
        else {
            System.out.println("Orden alfabetico: " + nombre2 + ", " + nombre1);
        }
        input.close();

    }
    
}
