package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6for {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if((n%i)==0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}
}