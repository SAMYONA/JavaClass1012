import java.util.Scanner;

public class Secondques {

	public static void main(String[] args) {
		
		//2. Take 3 values from console and store them inside an array.
		//Then update each value by adding 10 to it. Then print those updated values.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter firstValue:   ");
		int firstValue = scanner.nextInt();

		System.out.println("Enter secondValue:   ");
		int secondValue = scanner.nextInt();

		System.out.println("Enter thirdValue:   ");
		int thirdValue = scanner.nextInt();

		int storingInputNumbersInArray[] = { firstValue, secondValue, thirdValue };

		
		int storingInputNumbersInArrayAfterAddingfirstValue = firstValue + 10;
		int storingInputNumbersInArrayAfterAddingsecondValue = secondValue + 10;
		int storingInputNumbersInArrayAfterAddingthirdValue = thirdValue + 10;

		System.out.println("firarInputafteradding 10: " + storingInputNumbersInArrayAfterAddingfirstValue);

		System.out.println("secondInputafteradding 10: " + storingInputNumbersInArrayAfterAddingsecondValue);

		System.out.println("thirdInputafteradding 10: " + storingInputNumbersInArrayAfterAddingthirdValue);

	

	}
}
