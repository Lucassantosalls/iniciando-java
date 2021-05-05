package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3for {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int n;
		double y1,y2,y3,media;
		System.out.print("Número de valores a serem digitados: ");
		n = sc.nextInt();
		
		for (int x=0;x<n;x++) {
			System.out.print("Primeiro: ");
			y1 = sc.nextDouble();
			System.out.print("Segundo: ");
			y2 = sc.nextDouble();
			System.out.print("Terceiro: ");
			y3 = sc.nextDouble();
			
			media = (2.0*y1+3.0*y2+5.0*y3)/(2.0+3.0+5.0);
			System.out.printf("Media: %.2f%n",media);
		}
		
		sc.close();
		
	}
}