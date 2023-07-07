package com.zorba.setup;

public class Loop05 {

	//5. Write a program to print out all Armstrong numbers between 1 and 500. 
	//If sum of cubes of each digit of the number is equal to the number itself,
	//then the number is called an Armstrong number.For example,
	//153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
	
	public static void main(String[] args) {
		for (int number = 1; number <= 500; number++) {
			int originalNumber = number;
			int sum = 0;

			while (originalNumber != 0) {
				int digit = originalNumber % 10;
				sum +=(digit * digit * digit );
				originalNumber /= 10;
			}

			if (sum == number) {
				System.out.println(number);
			}
		}
	}
}
