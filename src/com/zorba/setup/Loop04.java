package com.zorba.setup;

import java.util.Scanner;

public class Loop04 {

	//4. Write a program that asks the user to enter two numbers. 
	//The numbers should be added and the sum displayed.
	//The loop should ask the user whether he or she wishes to perform the operation again.
	//If so, the loop should repeat;otherwise it should terminate.
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;

		do {
			System.out.print("Enter the first number: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();

			int sum = num1 + num2;
			System.out.println("Sum: " + sum);

			System.out.print("Do you want to perform the operation again? (Y/N): ");
			choice = scanner.next();
		} while (choice.equalsIgnoreCase("Y"));

		
	}
}
