package com.zorba.setup;

import java.util.Scanner;

public class Loop03 {
	
	//3. Write a program that reads a set of integers, and then prints the sum of the even and odd integers

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int even = 0;
		int odd = 0;

		System.out.print("Enter a set of integers (separated by spaces): ");
		String input = scanner.nextLine();
		Scanner numberScanner = new Scanner(input);

		while (numberScanner.hasNextInt()) {
			int num = numberScanner.nextInt();

			if (num % 2 == 0) {
				even += num;
			} else {
				odd += num;
			}
		}

		System.out.println("even integers: " + even);
		System.out.println("odd integers: " + odd);

	
	}
}
