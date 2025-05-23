package Unidad3;

public class Pasoporvalor {
    public static void intercambiar(int a, int b) {
    int temporalA = a;
    a = b;
    b = temporalA;
    System.out.println("Dentro del metodo: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 13;
        System.out.println("Antes de intercambiar: a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Despues de intercambiar: a = " + a + ", b = " + b);
    }

}