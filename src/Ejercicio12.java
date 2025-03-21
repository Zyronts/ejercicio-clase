import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int sueldos100_300 = 0;
        int sueldosMas300 = 0;
        float gastoTotal = 0;

        System.out.println("Ingrese la cantidad de empleados");
        int cantidadEmpleados = input.nextInt();

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Ingrese el sueldo del empleado " + (i + 1));
            float sueldo = input.nextFloat();
            gastoTotal += sueldo;

            if (sueldo >= 100 && sueldo <= 300) {
                sueldos100_300++;
            } else if (sueldo > 300) {
                sueldosMas300++;
            }
        }
        System.out.println("Numeros de empleados con sueldo entre 100 y 300: " + sueldos100_300);
        System.out.println("Numeros de empleados con sueldo mayor a 300: " + sueldosMas300);
        System.out.println("Gasto total en sueldos: " + gastoTotal);
        input.close();

    
    }
}
