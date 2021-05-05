package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("Digite o Primeiro Valor: ");
		x = sc.nextInt();
		System.out.print("Digite o Segundo Valor: ");
		y = sc.nextInt();
				
		while(x!=0 && y!=0) {
			
			if (x>=0 && y>=0) {
				System.out.println("Q1");
			} else if (x<=0 && y>=0) {
				System.out.println("Q2");
			} else if (x<=0 && y<=0) {
				System.out.println("Q3");
			} else if (x>=0 && y<=0) {
				System.out.println("Q4");
			}
			System.out.print("Digite o Primeiro Valor: ");
				x = sc.nextInt();
		    System.out.print("Digite o Segundo Valor: ");
				y = sc.nextInt();
			
		}
		
		sc.close();
		
	}
}