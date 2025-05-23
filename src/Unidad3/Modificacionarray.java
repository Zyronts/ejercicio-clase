package Unidad3;

public class Modificacionarray {
    public static void modificarArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 5;

        }
        
    }
    public static void main(String[] args) {
        int[] num = {23,27,45,67,89};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(num));
        modificarArray(num);
        System.out.println("Despues de modificar: " + java.util.Arrays.toString(num));
    }
    
}
