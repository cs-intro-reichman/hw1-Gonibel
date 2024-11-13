// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	 
		// Replace this comment with your code
		String num1 = args[0];

		int num = Integer.parseInt(num1);

		int hundreds = num / 100;
		num = num % 100;
		int tens = num / 10;
		num = num % 10;

		System.out.println(hundreds + " hundreds, " + tens + " tens, " + num + " ones.");



	
	
	
	
	
	}
}
