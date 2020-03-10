package creationalDesignPattern;

public class Builder_design_pattern {
	public static void main(String args[])
	{
		Features f=new BuilderFactory().setCam_back(10).setBattery(2).setStorage(32).getall();
		
		System.out.println(f);
		
	}

}