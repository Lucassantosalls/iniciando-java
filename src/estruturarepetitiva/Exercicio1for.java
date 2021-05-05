package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1for {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.print("Digite um valor inteiro: ");
		x = sc.nextInt();
		
		for (int i=1; i<x ; i++) {
			if (i%2 >0 ){
				System.out.println(i);
			} else {
		
			}
		}
		
		sc.close();
		
	}
}