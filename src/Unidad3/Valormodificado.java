package Unidad3;

public class Valormodificado {
    public static void Incrementar(int x) {
        x += 1;
        System.out.println("Dentro del metodo: " + x);
        return;

    }
    
    public static void main(String[] args) {
        int x = 200;
        System.out.println("Antes de modificar: " + x);
        Incrementar(x);
        System.out.println("Despues de modificar: " + x);
        // El valor de x no se modifica fuera del metodo porque se pasa por valor;
        // es decir, se pasa una copia del valor de x al metodo Incrementar.
        // Por lo tanto, el valor de x en el metodo main sigue siendo 200.
        
    }
}
