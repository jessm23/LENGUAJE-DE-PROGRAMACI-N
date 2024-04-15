package Aplicaciones;
import java.util.Scanner;
public class Enunciado03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Calculadora de area y precio de terreno rectangular");
        System.out.print("Ingrese la longitud del terreno en metros: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingrese la anchura del terreno en metros: ");
        double anchura = scanner.nextDouble();

        double area = calcularArea(longitud, anchura);
        double precio = calcularPrecio(area);

        System.out.println("El area del terreno es: " + area + " metros cuadrados");
        System.out.println("El precio del terreno es: S/. " + precio);

        scanner.close();
    }

    public static double calcularArea(double longitud, double anchura) 
    {
        return longitud * anchura;
        
    }

    public static double calcularPrecio(double area) {
        double costoPorMetroCuadrado = 750.0; // Costo por metro cuadrado en soles
        return area * costoPorMetroCuadrado;
 
    }
    
}