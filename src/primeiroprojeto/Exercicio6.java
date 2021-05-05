package primeiroprojeto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc= new Scanner(System.in);
		
			double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
			
			System.out.print("A: ");
			a = sc.nextDouble();
			System.out.print("B: ");
			b = sc.nextDouble();
			System.out.print("C: ");
			c = sc.nextDouble();
			System.out.println();
			
			triangulo = (a*c)/2;
			circulo = 3.14159*Math.pow(c, 2);
			trapezio = c*(a+b)/2;
			quadrado = Math.pow(b,2);
			retangulo = a*b;
			
			System.out.printf("Triangulo: %.3f%n",triangulo);
			System.out.printf("Circulo: %.3f%n",circulo);
			System.out.printf("Trapezio: %.3f%n",trapezio);
			System.out.printf("Quadrado: %.3f%n",quadrado);
			System.out.printf("Retangulo: %.3f%n",retangulo);
		
		sc.close();
		
	}		
}