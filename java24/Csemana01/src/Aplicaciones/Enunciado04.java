package Aplicaciones;
import java.util.Scanner;
public class Enunciado04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        // Solicitar al usuario que ingrese la base y la altura del rectángulo
        System.out.print("Ingresa la base del rectangulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingresa la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        
        // Calcular el área del rectángulo (A = base * altura)
        double area = base * altura;
        
        // Calcular el perímetro del rectángulo (P = 2 * (base + altura))
        double perimetro = 2 * (base + altura);
        
        // Mostrar los resultados
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

        scanner.close();
        
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
    }
}