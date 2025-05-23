package Unidad3;
class Rectangulo {
    int alto;
    int ancho;
    int area;

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
        this.area = alto * ancho;
    }
}

public class Pasoporreferencia {
    public static void modificarRectangulo(Rectangulo f) {
        f.alto = 10;
        f.ancho = 25;
        f.area = f.alto * f.ancho;
    
    }
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(12, 29);
        System.out.println("Antes de modificar: " + rectangulo.alto + ", " + rectangulo.ancho + ", " + rectangulo.area);
        modificarRectangulo(rectangulo);
        System.out.println("Despues de modificar: " + rectangulo.alto + ", " + rectangulo.ancho + ", " + rectangulo.area);

    }
}
