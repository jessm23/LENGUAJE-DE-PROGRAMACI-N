package Aplicaciones;
import java.util.Scanner;
public class Cejemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float base, altura, area;
        
        System.out.print("Ingrese un base :");
        base = Float.parseFloat(teclado.nextLine());
        System.out.print("Ingrese un altura :");
        altura = Float.parseFloat(teclado.nextLine());
        
        area = base* altura;
        System.out.println("----------------");
        System.out.println("-----Reporte----");
        System.out.println("----------------");
        System.out.println("La base es:" + base);    
        System.out.println("La altura es:" + altura);         
        System.out.println("El area es:"+ area);
    }
}
