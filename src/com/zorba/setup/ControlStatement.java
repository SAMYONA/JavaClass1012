package com.zorba.setup;

public class ControlStatement {

	public static void main(String[] args) {
		//control statement
		int a = 12;
		int b = 34;
		int c = 56;
		
		int num[] = { 12, 34, 56 };
		
		num [0] = 12;
		num[1] = 34;
		num[2] = 56;
		int largestNumber = a[];
	 for (int i=1, i<a.length; i++) {
		 if (a[i] > largestNumber) {
			 largestNumber = a[i];
		 }
	 }
		
		System.out.println("the largestnumber is :" + largestNumber);
		
		
		if (a >b && a>c ) {
			System.out.println("a is the largest");
	}
		else if (b>c && b>a ) {
			System.out.println("b is the largest");
	}
		else { 
			System.out.println("c is the largest");
		}
	}

}
int a[] = { 12, 85, 56, 150, 1, 0, -200, 670, 64, 650 , 989 ,100 };
int largestNumber = a[0];//12

for (int i = 1; i < a.length ; i++) {
 if (a[i] > largestNumber) {
  largestNumber = a[i];
 }
}

System.out.println("The largest number is:" + largestNumber);

}