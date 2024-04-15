package Aplicaciones;
import java.util.Scanner;
public class Enunciado02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de indice de Masa Corporal (IMC)");
        System.out.println("---------------------------------------");
        System.out.println("-----------------Reporte---------------");
        System.out.println("---------------------------------------");
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Su indice de Masa Corporal (IMC) es: " + imc);
        
        interpretarIMC(imc);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public static void interpretarIMC(double imc) {
        System.out.println("---------------------------------------");
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {  
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
        System.out.println("---------------------------------------");
    }    
}