package logger;

public class Calculate_cost {
	float calculate(String materialType, int area) {
		{
	Material_type mt=new Material_type();
	int k=mt.material(materialType);
	int p= k*area;
	return p;
	}
	
}
}
