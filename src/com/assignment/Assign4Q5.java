package com.assignment;

public class Assign4Q5 {
//Java Program to print the second largest element in an array:
	
	    public static void main(String[] args) {
	        int[] arr = {7, 2, 9, 1, 5};
	        int largest = arr[0];
	        int secondLargest = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        System.out.println("Second largest element: " + secondLargest);
	    }
	}


