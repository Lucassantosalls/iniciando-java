package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2for {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int n,n1,soma=0,soma1=0;
		
		System.out.print("Quantidade de números a ser lido: ");
		n = sc.nextInt();
		
		for (int x=0; x<n ; x++) {
			System.out.print("Digite um número: ");
			n1=sc.nextInt();
			if (n1>=10 && n1<=20) {
				soma = soma+1;
			}else{
				soma1 = soma1+1;
			}
		}
		
		System.out.println(soma+" in");
		System.out.println(soma1+" out");
		
		sc.close();
		
	}
}