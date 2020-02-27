package logger;

public class Material_type {
	int material(String materialType)
	{		
		if(materialType.equals("SM") )
			return 1200;
		else if(materialType.equals("ASM")) 
			return 1500;
		else if(materialType.equals("HSM")) 
			return 1800;
		else if(materialType.equals("FAH"))
			return 2500 ;
		return 0;		
	}
}
