package Unidad3;

public class Cadenaporvalor {
    public static void modificarCadena(String texto) {
        texto = texto + " recomiendo number one";
        System.out.println("Dentro del metodo: " + texto);
    }

    public static void main(String[] args) {
        String texto = "Good night";
        System.out.println("Antes de modificar: " + texto);
        modificarCadena(texto);
        System.out.println("Despues de modificar: " + texto);
    }
    
}
