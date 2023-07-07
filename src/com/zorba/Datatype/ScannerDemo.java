package com.zorba.Datatype;

import java.util.Scanner;

public class ScannerDemo {
	
	static double initialAmount;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Opening bank account");
		System.out.println("What amount initially you want for opening balance");
		initialAmount = scanner.nextDouble();
		
		System.out.println("Enter amount you want to deposite?");
		double depositeAmount = scanner.nextDouble();
		deposite(depositeAmount);
		checkBalance();
	}

	
	public static double deposite(double depositeAmount) {
		initialAmount = initialAmount + depositeAmount;
		//System.out.println(initialAmount);
		return initialAmount;
		
	}
	
	public static void checkBalance() {
		System.out.println("The availbale amount in account is:"+ initialAmount );
		
	}

}


//project
//considering initial amount was - 1000 USD
//deposite -> where customer can add money
	   
public class CalculatorDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = scanner.nextInt();

		System.out.println("Enter Second number");
		int number2 = scanner.nextInt();
		
		double add = addition(number1, number2);
		System.out.println(add);

	}

	public static double addition(int num1, double num2) {
		double num3 = num1 + num2;
		System.out.println("The addition of two numbers are: " + num3);
		return num3;
	}

}
	   
	
	   
			   

	


