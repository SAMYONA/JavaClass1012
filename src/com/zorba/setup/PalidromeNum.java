package com.zorba.setup;

public class PalidromeNum {


  public static boolean isPalindrome(int number) {
   String str = String.valueOf(number);
   String reversed = new StringBuilder(str).reverse().toString();
      return str.equals(reversed);
		    }

		    public static void findPalindromes(int[] array) {
		        System.out.print("Palindromes: ");
		        for (int num : array) {
		            if (isPalindrome(num)) {
		                System.out.print(num + " ");
		            }
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        int[] array = {121, 234, 343, 456, 787};
		        findPalindromes(array);
		

}

}
