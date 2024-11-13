// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code

		String lim1 = args[0];
		int lim = Integer.parseInt(lim1);
		int a = (int) Math.ceil(Math.random()*lim);
		int b = (int) Math.ceil(Math.random()*lim);
		int c = (int) Math.ceil(Math.random()*lim);

		int min = Math.min(a, b);
		min = Math.min(min, c);
		int max = Math.max(a, b);
		max = Math.max(max, c);
		int mid1 = Math.max(a,b);
		int mid2 = Math.max(b,c);
		int midfinal = Math.min(mid1, mid2);

		System.out.println("Ascend " + lim);
		System.out.println(min + ", " + midfinal + ", " + max );
	}
}
