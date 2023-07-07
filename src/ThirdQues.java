
public class ThirdQues {

	public static void main(String[] args) {
		
		//Create an array of integer and store some values there.
		//Create another array of integer type and copy values from first array to the second one.
		//Print the values from second array.
	
		int firstArrayWithSomeValues[] = { 20, 10, 20, 30, 40, 50 };

		int anotherArrayOfInteger[] = new int[firstArrayWithSomeValues.length];

		System.arraycopy(firstArrayWithSomeValues, 0, anotherArrayOfInteger, 0, firstArrayWithSomeValues.length);

		for (int value : anotherArrayOfInteger) {
			System.out.println(value);
		}
		       
		    
		

	}
}

