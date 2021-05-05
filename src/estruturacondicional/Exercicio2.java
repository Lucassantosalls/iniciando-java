package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
	
			int x,y;
			
			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();
			y = Math.abs(x);
			
			if (y%2 >0 ){
				System.out.print("Número impar");
			} else {
				System.out.println("Número par");
			}
				
		
		sc.close();
	}
}