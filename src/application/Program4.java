package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank();
		System.out.println("Enter account number: ");
		bank.number = sc.nextInt();
		System.out.println("Enter account holder: ");
		bank.holder = sc.nextLine();
		System.out.println("In there na initial deposit value(y/n)?: ");
		String yn = sc.nextLine();
		if (yn == "y"){
			System.out.println("Enter initial deposit value: ");
			
		}
		else {
			
		}
		
		
		
		sc.close();
	}

}
