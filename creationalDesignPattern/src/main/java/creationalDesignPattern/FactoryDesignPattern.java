package creationalDesignPattern;

import java.util.Scanner;

public class FactoryDesignPattern {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the model phone you want to check");
		String s=sc.next();
		
		CostFactory e=new CostFactory();
		Specialization w=e.getPhone(s);
		
		w.camera();
		w.storagecapacity();
		
		w.cost();
	}

}