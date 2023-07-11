package com.assignment;

import java.util.Arrays;

public class Ques02 {
	//Q2. Create an Array with 6 random numbers.
	 //Then create two different array from that first  Array where one array will be only with odd numbers and another will be with even numbers.


	public static void main(String[] args) {
		int[] creatingArrayWithSixRandomNumbers = { 5, 10, 15, 20, 25, 30 };

		  int[] oddNumbersArray = new int[creatingArrayWithSixRandomNumbers.length];
		  int[] evenNumbersArray = new int[creatingArrayWithSixRandomNumbers.length];
		  int oddNumberCount = 0;
		  int evenNumberCount = 0;

		  for (int number : creatingArrayWithSixRandomNumbers) {
		   if (number % 2 == 0) {
		    evenNumbersArray[evenNumberCount++] = number;
		   } else {
		    oddNumbersArray[oddNumberCount++] = number;
		   }
		  }

		  oddNumbersArray = Arrays.copyOf(oddNumbersArray, oddNumberCount);
		  evenNumbersArray = Arrays.copyOf(evenNumbersArray, evenNumberCount);
		  System.out.println("Original Number Array: " + Arrays.toString(creatingArrayWithSixRandomNumbers));
		  System.out.println("Odd Number Array: " + Arrays.toString(oddNumbersArray));
		  System.out.println("Even Number Array: " + Arrays.toString(evenNumbersArray));

		 }

		}