package com.zorba.setup;

import java.util.Scanner;

public class Methodcalling {

	public static void main(String args[]) {

		// can you check if any specific String// hari is availabel inside the Array or
		// not?
		// can you calculate how many time the name "hari" appeared in the array
		// user can search for any name , how many times it has appeared to array
		// I want to display the count of all the available values , how many times they
		// appeared in array

		// I want to develop a method which will accept an array and the value in
		// parameter,
		// then it will tell me that particular value is preseent inside the array or
		// how many times

		Scanner scanner = new Scanner(System.in);
		String[] names = { "subhendu", "Rajesh", "viviek", "hari", "Ravi", "hari", "Ritesh", "hari" };

	  System.out.println("Please write the name");
		String value = scanner.nextLine();

		boolean isValuePresent = checkValue(names, value);
		if (isValuePresent) {
			System.out.println("Name is present");
		} else {
			System.out.println("Name is not present");

			int count = countOccurrences(names, value);
			System.out.println("The value '" + value + "' appears " + count + " times in the array.");
		}
	}

	public static boolean checkValue(String[] arr, String value) {
		for (String name : arr) {
			if (name.equals(value)) {
				return true;
			}
		}
		return false;
	}

	public static int countOccurrences(String[] array, String value) {
		int count = 0;
		for (String name : array) {
			if (name.equals(value)) {
				count++;
			}
		}
		return count;
	}
}
