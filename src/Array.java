import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int firstnumber = scanner.nextInt(); 
		
		System.out.println("enter second number");
		int secondnumber = scanner.nextInt(); 
				
		System.out.println("enter third number");
		int thirdnumber = scanner.nextInt(); 
				
		int []numbers = {firstnumber, secondnumber, thirdnumber};
		
		System.out.println(numbers [0]);
		System.out.println(numbers [1]);
		System.out.println(numbers [2]);
				
				
		
		
}
}
