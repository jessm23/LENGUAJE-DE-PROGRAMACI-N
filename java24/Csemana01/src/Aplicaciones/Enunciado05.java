package Aplicaciones;
import java.util.Scanner;
public class Enunciado05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        // Solicitar al usuario que ingrese el radio y la altura del cilindro
        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el área total del cilindro (A = 2 * pi * radio * (radio + altura))
        double areaTotal = 2 * Math.PI * radio * (radio + altura);

        // Calcular el volumen del cilindro (V = pi * radio^2 * altura)
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Mostrar los resultados
        System.out.println("El area total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);
        
        scanner.close();
        
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
    }
}