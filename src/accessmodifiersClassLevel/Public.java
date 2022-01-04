package accessmodifiersClassLevel;

public class Public {
	
	 // disscussion of "public" accesss modifier
	// //  "Public" keyword allows the class to be accessible anywhere inside the project
public static void m1()
{
	System.out.println("m1 from test class");
}
	
	
	public static void main(String[] args) {
		
		Public t= new Public ();
		
		 m1();		
		
		
	}
	
	
	
}
