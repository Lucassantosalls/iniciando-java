package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4for {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int n;
		double nu1=0,nu2=0,divisao=0;
		System.out.print("Quantidade de numeros: ");
		n = sc.nextInt();
		
		for (int x=0; x<n; x++) {
			System.out.print("Primeiro: ");
			nu1 = sc.nextInt();
			System.out.print("Segundo: ");
			nu2 = sc.nextInt();
			
			divisao = nu1/nu2;
			
			if (nu2 == 0) {
				System.out.println("Divisão Impossivel");
			} else {
				System.out.println("Resultado: "+divisao);
			}
		}
		
		sc.close();
		
	}
}