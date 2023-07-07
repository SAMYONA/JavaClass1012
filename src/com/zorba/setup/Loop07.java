package com.zorba.setup;

import java.util.Scanner;

public class Loop07 {

	// 7. Write a program to enter the numbers till the user wants and at the end
	// the program should display the largest and smallest numbers entered.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		char choice;

		do {
			System.out.print("Enter a number: ");
			number = scanner.nextInt();

			if (number < smallest) {
				smallest = number;
			}

			if (number > largest) {
				largest = number;
			}

			System.out.print("Do you want to enter another number? (Y/N): ");
			choice = scanner.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');

		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);

	}
}
