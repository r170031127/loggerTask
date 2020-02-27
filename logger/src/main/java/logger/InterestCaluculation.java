package logger;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCaluculation {
	private static final Logger LOGGER=LogManager.getLogger(Total_cost.class);
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		int principle_amount=scanner.nextInt();
		int time=scanner.nextInt();
		int rate_of_interest=scanner.nextInt();
		SimpleInterest s=new SimpleInterest();
		CompoundInterest c=new CompoundInterest();
		LOGGER.debug("Simple Interest : "+s.simple(principle_amount,time,rate_of_interest));
		LOGGER.debug("Compound Interest : "+c.compound(principle_amount,time,rate_of_interest));
		scanner.close();
		
	}
}
