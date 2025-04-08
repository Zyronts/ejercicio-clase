package Unidad1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el sueldo");
        float sueldo = input.nextFloat();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos");
            
        }
        input.close();

    }
}
