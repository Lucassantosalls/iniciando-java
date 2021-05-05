package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("What is the dollar price?: ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought?: ");
		double quantitidollar = sc.nextDouble();
		
		double d = CurrencyConverter.dollar(dollar,quantitidollar);
		
		System.out.printf("Amount to be paid in reais = %.2f",d);
		
		sc.close();
	}

}
