package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		double x,z,z1,z2;
		
		System.out.print("Digite o salário: ");
		x = sc.nextDouble();
		
		z = (x-2000.00)*0.08;
		z1 = (x-3000.00)* 0.18 + 1000.0 * 0.08;
		z2 = (x-4500.00)* 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		
		if (x>=0 && x<2000.00) {
			System.out.print("Isento");
		} else if (x>=2000.00 && x<3000.00) {
			System.out.printf("Total: %.2f",z);
		} else if (x>=3000.00 && x<4500.00) {
			System.out.printf("Total: %.2f",z1);
		} else if (x>4500.00) {
			System.out.printf("Total: %.2f",z2);
		}
		
		sc.close();
		
	}
}