package com.assignment;

public class Ab1 {

	public static void main(String[] args) {

		// Q1. Write a program to calculate the average of the given numbers in an
		// Array.

		int[] numbers = { 10, 20, 30, 40 };

		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}
		double average = (double) sum / numbers.length;
		System.out.println("average:" + average);
	}

}
