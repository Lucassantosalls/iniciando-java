package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,d,e,z;
		int x,y;
		
		a = 4.00;
		b = 4.50;
		c = 5.00;
		d = 2.00;
		e = 1.50;
		
		System.out.print("Digite o código do produto: ");
		x = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		y = sc.nextInt();
		
		if (x == 1) {
			z = a*y;
			System.out.printf("Total: %.2f",z);
		} else if (x == 2) {
			z = b*y;
			System.out.printf("Total: %.2f",z);
		} else if (x == 3) {
			z = c*y;
			System.out.printf("Total: %.2f",z);
		} else if (x == 4) {
			z = d*y;
			System.out.printf("Total: %.2f",z);
		} else if (x == 5) {
			z = e*y;
			System.out.printf("Total: %.2f",z);
		} else {
			System.out.println("Digite um código válido");
		}
		
		sc.close();
		
	}
}