package Unidad2;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int articulos = 5;
        int sucursales = 4;

        float[] precios = new float[articulos];
        int[][] ventas = new int[sucursales][articulos];
        int[] totalArticulos = new int[articulos];
        float[] recaudacionSucursal = new float[sucursales];

        System.out.println("Introduce los precios de los 5 artículos:");
        for (int i = 0; i < articulos; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = input.nextFloat();
        }

        System.out.println("\nIntroduce las cantidades vendidas en cada sucursal:");
        for (int i = 0; i < sucursales; i++) {
            System.out.println("Sucursal " + (i + 1) + ":");
            for (int j = 0; j < articulos; j++) {
                System.out.print("Cantidad de artículo " + (j + 1) + ": ");
                ventas[i][j] = input.nextInt();
                
                totalArticulos[j] += ventas[i][j];

                recaudacionSucursal[i] += ventas[i][j] * precios[j];
            }
        }

        System.out.println("\nCantidad total vendida por artículo:");
        for (int i = 0; i < articulos; i++) {
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulos[i] + " unidades");
        }

        System.out.println("\nCantidad de artículos vendidos en la sucursal 2:");
        for (int j = 0; j < articulos; j++) {
            System.out.println("Artículo " + (j + 1) + ": " + ventas[1][j] + " unidades");
        }

        System.out.println("\nCantidad del artículo 3 en la sucursal 1: " + ventas[0][2] + " unidades");

        System.out.println("\nRecaudación total por sucursal:");
        float recaudacionTotal = 0;
        int sucursalMayor = 0;
        float mayorRecaudacion = recaudacionSucursal[0];

        for (int i = 0; i < sucursales; i++) {
            System.out.println("Sucursal " + (i + 1) + ": $" + recaudacionSucursal[i]);
            recaudacionTotal += recaudacionSucursal[i];

            if (recaudacionSucursal[i] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[i];
                sucursalMayor = i + 1;
            }
        }

        System.out.println("\nRecaudación total de la empresa: $" + recaudacionTotal);

        System.out.println("La sucursal con mayor recaudación es la número " + sucursalMayor + " con $" + mayorRecaudacion);

        input.close();
    }
}