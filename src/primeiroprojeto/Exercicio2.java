package primeiroprojeto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc= new Scanner(System.in);
		
			double raio,area;
			System.out.print("Digite o valor do raio: ");
			raio = sc.nextDouble();
			area = 3.14159*Math.pow(raio,2);
			System.out.printf("O valor da área é: %.4f",area);
		
		sc.close();
	}
	
}