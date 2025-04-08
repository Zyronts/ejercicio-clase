package Unidad1;
public class Tienda {
 
    public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        double descuento = 0.15;
        double descuentoAdicional = 0.05;

        // Precio después del descuento del 15%
        double precioCamisetaDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonDescuento = precioPantalon * (1 - descuento);
        System.out.println("El precio de la camiseta después del descuento es: $" + precioCamisetaDescuento);
        System.out.println("El precio del pantalón después del descuento es: $" + precioPantalonDescuento);
        double precioTotalconunDescuento = precioCamisetaDescuento + precioPantalonDescuento; 
        System.out.println("El precio total de ambas prendas después de aplicar un descuento del 15% es: $" + precioTotalconunDescuento);

        // Precio de la segunda camiseta con descuento del 15%
        double precioSegundaCamiseta = precioCamiseta * (1 - descuento);
        System.out.println("El precio de la segunda camiseta después del descuento es: $" + precioSegundaCamiseta);
        // Precio de la primera camiseta con descuento adicional del 5%
        double precioCamisetaDescuentoExtra = precioCamisetaDescuento * (1 - descuentoAdicional);
        System.out.println("El precio de la primera camiseta con descuento  es: $" + precioCamisetaDescuentoExtra);
        double precioTotalCamisetas = precioCamisetaDescuentoExtra + precioSegundaCamiseta;
        System.out.println("El precio total de ambas camisetas después de aplicar el descuento adicional es: $" + precioTotalCamisetas);

        // Precio total de prendas con descuento del 15% y descuento adicional del 5%
        double precioTotal = precioPantalonDescuento + precioTotalCamisetas;

        System.out.println("El precio total de todas las prendas después de aplicar ambos descuentos es: $" + precioTotal);
    }
}