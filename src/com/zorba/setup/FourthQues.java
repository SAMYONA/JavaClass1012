package com.zorba.setup;

import java.util.Scanner;

public class FourthQues {

	public static void main(String[] args) {
		
		//Create one interactive system where I'd customer type 1 , 
		//then system will ask to provide two numbers and perform addition .
		//Similar way for 2 ,system perform substraction . For 3, division and for 4 multiplication
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please select from the options below:");
		System.out.println("Type 1 to perform Addition");
		System.out.println("Type 2 to perform Subtraction");
		System.out.println("Type 3 to perform Division");
		System.out.println("Type 4 to perform Multiplication");
		int takingInputToPerformTask = scanner.nextInt();

		System.out.println(" Great!! Now Enter first any  number of your choice to perform the operation: ");
		double firstNumberEntered = scanner.nextDouble();

		System.out.println(
				" AWESOME!!   Likewise, Now Enter Second any  number of your choice to perform the operation: ");
		double secondNumberEntered = scanner.nextDouble();

		double outComes = 0;

		switch (takingInputToPerformTask) {
		case 1:
			outComes = firstNumberEntered +secondNumberEntered;
			System.out.println("Your addition of two numbers is: " + outComes);

			break;

		case 2:
			outComes = firstNumberEntered - secondNumberEntered;
			System.out.println("Your substraction of two numbers is: " + outComes);

			break;

		case 3:
			outComes = firstNumberEntered / secondNumberEntered;
			System.out.println("Your division of two numbers is: " + outComes);

			break;

		case 4:
			outComes = firstNumberEntered * secondNumberEntered;
			System.out.println("Your multiplication of two numbers is: " + outComes);

			break;

		default:
			System.out.println("Sorry!! We cannot recognize your selection. Please try again later!! ");

			break;

		}

	}
}

	
