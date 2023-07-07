
package com.zorba.setup;


public class Firstclass {

	public static void main(String[] args) {
	
		
		int number = 356;
        

		int digit1 = number % 10; //6
		number /= 10; //35
		//System.out.println(digit1);

		int digit2 = number % 10;
		number /= 10; //5
		//System.out.println(digit2);

		int digit3 = number % 10; //3
        //System.out.println(digit3);
	 System.out.println( digit3 + " " + digit2 + " " + digit1);
	 
	 System.out.println("summation of all the three individual digits are :" +( digit3+digit2+digit1));
		
		
		
		
		
		
	}

}
