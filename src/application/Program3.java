package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos x;
		x = new Alunos();
		
		System.out.print("Nome do ALUNO: ");
		x.name = sc.nextLine();
		System.out.print("Nota 1: ");
		x.note1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		x.note2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		x.note3 = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Name: "+x.name);
		if (x.notepass() >60) {
		  System.out.printf("Final grade: %.2f%n",x.notepass());
		  System.out.println("PASS");
		} else {
		  System.out.printf("Final grade: %.2f%n",x.notepass());
		  System.out.println("FAILED");
		  System.out.printf("Missing: %.2f POINTS",x.notefaled());
		}
			
		sc.close();
	}

}
