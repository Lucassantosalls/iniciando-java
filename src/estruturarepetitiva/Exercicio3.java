package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int g,a,d,x;
		g=0;
		a=0;
		d=0;
		
		System.out.print("Digite o tipo de combustível: ");
		x = sc.nextInt();
		
		while (x!=4) {
			
			if (x==1) {
				a = a+1;
			} else if (x==2) {
				g = g+1;
			} else if (x==3) {
				d = d+1;
			} else {
				System.out.println("Digite um código válido");
			}
			
			System.out.print("Digite o tipo de combustível: ");
			x = sc.nextInt();
			
		}
		
		System.out.println("Muito obridada");
		System.out.println("Alcool: "+a);
		System.out.println("Gasolina: "+g);
		System.out.println("Diesel: "+d);
		
		sc.close();
		
	}
}