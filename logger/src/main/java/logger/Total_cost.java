package logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Total_cost {
	private static final Logger LOGGER=LogManager.getLogger(Total_cost.class);
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.debug("Select material Type");
		LOGGER.debug("Standard materials : SM");
		LOGGER.debug("above Standard materials : ASM");
		LOGGER.debug("high standard materialn : HSM");
		LOGGER.debug("fully automated home : FAH");
		
		String materialType=sc.nextLine();
		LOGGER.debug("Enter area of house ");
		int areaOfHouse=sc.nextInt();
		Calculate_cost cc=new Calculate_cost();
		float p=(float) cc.calculate(materialType,areaOfHouse);
		LOGGER.debug("Total cost for House Construction : Rs"+p);
		
		sc.close();
	}
}
