package DesignPatternBehavioral;

import java.util.Scanner;

public class Strategy_Design_Pattern {
public static void main(String args[])
{Scanner ama=new Scanner(System.in);
System.out.println("Enter the values of a and b");
int a1=ama.nextInt();
int b1=ama.nextInt();

	Access a = new Access(new Addition_number());		
    a.accessing(a1,b1);
    Access a3 = new Access(new Modulus_number());		
    a3.accessing(a1,b1);
    Access a4 = new Access(new power());		
    a4.accessing(a1,b1);
    
	
}
}