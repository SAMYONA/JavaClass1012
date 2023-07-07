package com.zorba.setup;



public class ArrayReveraed {
	    public static int[] reverseCopy(int[] array) {
	        int[] reversedArray = new int[array.length];
	        int index = array.length - 1;
	        for (int num : array) {
	            reversedArray[index] = num;
	            index--;
	        }
	        return reversedArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        int[] reversedCopy = reverseCopy(array);
	        System.out.print("Reversed copy: ");
	        for (int num : reversedCopy) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}



