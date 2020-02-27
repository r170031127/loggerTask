package logger;

public class CompoundInterest {
	public double compound(int principle_amount,int time,int rate_of_interest)
	{
		double x=Math.pow((1+(rate_of_interest/100)),time);
		double result = principle_amount*x;
		return result;
	}
}
