package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
			int a,b,c;
			
			System.out.print("Digite a hora que começou: ");
			a = sc.nextInt();
			System.out.print("Digite a hora que terminou: ");	
			b = sc.nextInt();
			
			if (a==b) {
				c = a-b;
				System.out.printf("O jogo durou 24 horas");
			} else if (a<b) {
				c = a-b;
				c = Math.abs(c);
				System.out.printf("O jogo durou "+c+" hora(s)");
			} else {
				c = ((24-a)+b);
				System.out.printf("O jogo durou "+c+" hora(s)");
			}
			
		sc.close();
		
	}
}