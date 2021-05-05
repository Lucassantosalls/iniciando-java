package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
				
		while(senha != 2002) {
			System.out.println("Senha inválida");
			System.out.println();
			System.out.print("Digite outra senha: ");
			senha = sc.nextInt();
		}
		
		System.out.print("Acesso permitido");
		
		sc.close();
		
	}
}