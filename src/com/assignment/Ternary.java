package com.assignment;

public class Ternary {

	public static void main(String[] args) {
				
		int [] numbers = {10, 20, 40, 60, 30, 70};
		
		int  temp;
		
		int size = numbers.length;
		for (int i = 0 ; i< size / 2 ;i++) {
			temp =  numbers[i];
			numbers[i] = numbers[size - 1- i];
			numbers[size - i - 1] = temp;
		}
		
		for (int num : numbers) {
			System.out.print(num+ " ");
			
		}
		
	}

}


