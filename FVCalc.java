// Computes the future value of a saving investment.
public class FVCalc {
	public FVCalc(){}
	public static void main(String[] args){
		// Replace this comment with your code

		String currentvalue1 = args[0];
		String rate1 = args[1];
		String years1 = args[2];

		int currentvalue = Integer.parseInt(currentvalue1);
		double rate = Double.parseDouble(rate1)/100;
		int years = Integer.parseInt(years1);

		double futurevalue = currentvalue * Math.pow((rate +1), years);
		

		System.out.println("After " + years + " years, a $" + currentvalue + " saved at " + rate*100 + "%" + years1+ " will yield $" + (int)futurevalue);



	}
}