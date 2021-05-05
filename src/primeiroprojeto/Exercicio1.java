package primeiroprojeto;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		System.out.print("Digite o Primeiro Valor: ");
		A = sc.nextInt();
		System.out.print("Digite o Segundo Valor: ");
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
	}
}