package com.zorba.setup;

public class OddandEven {

		    public static void verifyOddEven(int[] array) {
		        System.out.print("Odd numbers: ");
		        for (int num : array) {
		            if (num % 2 != 0) {
		                System.out.print(num + " ");
		            }
		        }
		        System.out.println();

		        System.out.print("Even numbers: ");
		        for (int num : array) {
		            if (num % 2 == 0) {
		                System.out.print(num + " ");
		            }
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        int[] array = {1, 2, 3, 4, 5};
		        verifyOddEven(array);
		    }
		

}


