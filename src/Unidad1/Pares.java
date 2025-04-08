package Unidad1;
public class Pares {
    public static void main(String[] args) {
        int contador = 0;

    for (int numero = 1; numero <= 100; numero++)
     if (numero % 2 ==0) {
        contador = contador+1;

     }
     System.out.println("numeros pares: " + contador);
    }
    
}
