package methodsdiscussion;


// calling static method inside non static method
public class MethodCallingInsideNonStatic {

	public void m7 ()
	{
		m8();
		m9();
	}
	
	
	public static void m8()
	{
		System.out.println("m8 is static method");
	}
	
	
	
	public static void m9()
	{
		System.out.println("m9 is static method");
	}
	
	public static void main(String[] args) {
		
		MethodCallingInsideNonStatic b= new MethodCallingInsideNonStatic();
		
		b.m7(); 
		b.m11();
		System.out.println("***********");
		b.papdyabhai();
		}
	
	
	// calling nonstatic method into nonstatic
	
	public void m10()
	{
	System.out.println("m10 is nonstatic");	
	}
	
	public void m11()
	{
		m10();
	System.out.println("m11 is nonstatic");	
	}
	
	// calling non static method from another class(from static class method=shub)
	
	public void papdyabhai()
	{
		MethodCallingInsideStatic ref = new MethodCallingInsideStatic();
		ref.shub();// here shub is a non static method which is in other class hence it can be called only by creating object 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
