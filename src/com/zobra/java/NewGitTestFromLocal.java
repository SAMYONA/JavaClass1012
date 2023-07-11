package com.zobra.java;

public class NewGitTestFromLocal {

	public static void main(String[] args) {
		/**
		 * 
		 * 1. Write a program to check if a particular number is
		 * available inside an integer array
		 * 
		 * 2. Write a program to verify the odd and even numbers from a given array.
		 * 
		 * 3. Write a program to detect all the palindrome from a given array
		 * 
		 * 4. Write a program to iterate all the numbers from the array and multiply by
		 * 5 to each Number and store the updated value in a different array and print
		 * those values from new array
		 * 
		 * 5. Write a program to copy one array to another array but in reverse order
		 */
		
		int [] array = {10,22,39,23,45,56,43,77,67,38};
		
		
		for(int num : array ) {
			if (num % 2 !=0) {
				System.out.println(num +"odd number. ");
				
			} 
		
			else {
				System.out.println(num +"even number." );
				
				
			}
		}
	}
}