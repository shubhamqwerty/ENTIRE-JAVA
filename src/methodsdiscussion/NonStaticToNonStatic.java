package methodsdiscussion;

public class NonStaticToNonStatic {

	public void m1()
	{
		System.out.println("this is m1");
	}
	
	public void m2 ()
	{
		m1();
		System.out.println("this is m2");
	}
	
	public static void main(String[] args) {
		
		NonStaticToNonStatic c = new NonStaticToNonStatic();
		 c.m2();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
