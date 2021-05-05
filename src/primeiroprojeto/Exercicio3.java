package primeiroprojeto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc= new Scanner(System.in);
		
			int a,b,c,d,formula;
			
			System.out.print("Digite o Primeiro Valor: ");
			a = sc.nextInt();
			System.out.print("Digite o Segundo Valor: ");
			b = sc.nextInt();
			System.out.print("Digite o Terceiro Valor: ");
			c = sc.nextInt();
			System.out.print("Digite o Quarto Valor: ");
			d = sc.nextInt();
			
			System.out.println();
			formula = a*b-c*d;
			System.out.print("Diferença: "+formula);		
			
		sc.close();
	}
}	