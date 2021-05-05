package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		
		if(x<0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}
			
		sc.close();
	}
}