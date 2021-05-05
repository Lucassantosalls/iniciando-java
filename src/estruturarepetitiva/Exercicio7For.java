package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7For {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int n,i2,i3;
		System.out.print("Digite um número inteiro positivo: ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			i2 = i*i;
			i3 = i*i*i;
			System.out.println(i+" "+i2+" "+i3);
			
		}
		
		sc.close();
		
	}
}