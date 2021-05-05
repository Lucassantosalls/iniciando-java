package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
			int a,b,c;
			
			System.out.print("Digite o primeiro valor: ");
			a = sc.nextInt();
			System.out.print("Digite o segundo valor: ");
			b = sc.nextInt();
			
			if (a>b) {
				c = a%b;
			} else {
				c = b%a;
			}
			
			if (c!=0) {
				System.out.println("Não são multiplos");
			} else {
				System.out.println("São multiplos");
			}
		
		sc.close();
	}
}