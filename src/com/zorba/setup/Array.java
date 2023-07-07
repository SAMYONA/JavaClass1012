package com.zorba.setup;

public class Array {

	public static void main(String[] args) {
	
		int x[] = {10,20,30,40};
		int y[] = new int [2];
		y=x;
		System.out.println(y.length);
		
		for (int i = 1; i<y.length; i++) {
			System.out.println(y[i]);
		}
		
		
	}

}
