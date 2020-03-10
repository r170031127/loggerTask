package creationalDesignPattern;

public class CostFactory {
public Specialization getPhone(String s)
{
	if (s.equals("redmi3"))
{
	return new redmi3();
}
	else if(s.equals("redmi4"))
			{
		return new redmi4();
				
			}
	else if(s.equals("redmi5"))
	{
		return new redmi5();
		
	}
	else
	{
		return(null);
	}
	
}
}