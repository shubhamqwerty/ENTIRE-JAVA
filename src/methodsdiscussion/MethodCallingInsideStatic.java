package methodsdiscussion;

public class MethodCallingInsideStatic {
	
           // calling a static method inside another static method
	
	public static void m1()
	{
		System.out.println("M1 static method");
		m2();
		m3();
	}
	
	public static void m2()
	{
		System.out.println("M2 STATIC METHOD");
		m3();
	}
	
	public static void m3()
	{
		System.out.println("M3 METHOD IS STATIC");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		m1();
		System.out.println("********************************");
		 m4();
	
	
}
	
	
// calling non static method into static method
	 
	public void m5()
	{
		System.out.println( "m5 is non static method");
		
		
	}
	
	public void m6()
	{
		System.out.println("m6 is nonstatic method");
	}
	
	
	
	
	
	
	public static void m4()
	{
		MethodCallingInsideStatic b = new MethodCallingInsideStatic();
		b.m5();
		b.m6();
	}
	
	
	// calling non static method from this class to another class
	
	public void shub() {
		 System.out.println("we all will be placed toghether");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
