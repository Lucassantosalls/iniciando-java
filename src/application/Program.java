package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x;
		x = new Triangle();
		
		System.out.println("Enter rectangle width and height:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		double area =  x.area();
		double perimeter = x.diagonal();
		double diagonal = x.perimeter();
		
		System.out.printf("AREA: %.2f%n",area);
		System.out.printf("PERIMETER: %.2f%n",perimeter);
		System.out.printf("DIAGONAL: %.2f%n",diagonal);
		
		
		sc.close();

	}

}
