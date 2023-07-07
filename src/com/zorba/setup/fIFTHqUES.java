package com.zorba.setup;

public class fIFTHqUES {

	public static void main(String[] args) {
		
		// 5. Create an array of type integer and store some numbers. Then check all the
		 // numbers from the array, if any numbers comes as 50, then replace that number
		 //by 100 and store inside array. Then print the whole modified array
		 

			int array[] = { 10, 30, 50, 60, 70,50};
			
			
			for (int i = 0; i < array.length; i++) {

				if (array[i] == 50) {

					array[i] = 100;
				}

			}
			
			
			for (int number : array) {
				System.out.print(number + " ");
			}
			System.err.println();
			
			vvvvv

		}

	}


