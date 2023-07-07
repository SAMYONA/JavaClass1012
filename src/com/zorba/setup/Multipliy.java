package com.zorba.setup;

public class Multipliy {

	    public static int[] multiplyByFive(int[] array) {
	        int[] multipliedArray = new int[array.length];
	        for (int i = 0; i < array.length; i++) {
	            multipliedArray[i] = array[i] * 5;
	        }
	        return multipliedArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        int[] multiplied = multiplyByFive(array);
	        System.out.print("Multiplied array: ");
	        for (int num : multiplied) {
	            System.out.print(num + " ");
	        }
	        System.out.println();



	}

}
