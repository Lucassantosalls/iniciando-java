package primeiroprojeto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc= new Scanner(System.in);
		
			int numero,horas;
			double salariohora,salario;
			
			System.out.print("Número do funcionário: ");
			numero = sc.nextInt();
			System.out.print("Horas trabalhadas: ");
			horas = sc.nextInt();
			System.out.print("Salário: ");
			salariohora = sc.nextDouble();
			
			System.out.println();
			System.out.println("Número: "+numero);
			salario = horas*salariohora;
			System.out.printf("Salário do funcionário: R$ %.2f",salario);
		
		sc.close();
		
	}
	
}