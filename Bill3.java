// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		String bill = args[3];

		double bill1 = Double.parseDouble(bill);

		double split = bill1/3.0;
		double split1 = Math.ceil(split);

		System.out.println("Dear " + name1 + ", " + name2 + ", " + name3 + ". You have to pay " + split1 + " $ please.");

	    // Replace this comment with the rest of your code   
	}
}
