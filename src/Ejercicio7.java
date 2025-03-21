import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un numero positivo de hasta tres cifras");
        int numero = input.nextInt();

        if (numero >= 0 && numero <= 999) {
            if (numero <= 9) {
                System.out.println("El numero tiene una cifra: " + numero);
            }
            else if (numero <= 99) {
                System.out.println("El numero tiene dos cifras: " + numero);
            }
            else if (numero <=999) {
                System.out.println("El numero tiene tres cifras: " + numero);
            }
        }
        else {
            System.out.println("El numero no es positivo o tiene mas de tres cifras");
        }
        input.close();
    }
    
}
