package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5for {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int numero,mult=1;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		for (int i=1; i<=numero; i++) {
			mult = mult*i;
		}
		
		System.out.println(mult);
		
		sc.close();
		
	}
}