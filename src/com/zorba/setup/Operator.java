package com.zorba.setup;

public class Operator {

	public static void main(String[] args) {
		int num = 7899;
		num = num / 10; // 78
		
		int fourthNum = num % 10; // 9

		int thirdNum = num % 10;// 9
		num = num / 10; // 78

		int secondNum = num % 10; // 8
		num = num / 10; // 78

		int firstNum = num % 10; // 0
		

		System.out.println(firstNum);
	
		System.out.println(thirdNum);
		System.out.println(fourthNum);
		System.out.println(secondNum);
	}

}
