package methodsdiscussion;

public class StaticMethodDisscussion {
	
	// syntax of static method
	 //public static void name of method()
	{
		
	}
	 
	public static void addition() 
	{
		int a=12;
		int b=20;
		int c=a+b;
		
		System.out.println("c=" + c);
	}
    
	public static void multiplication()
	{
	 int a=12;
	 int b=20;
		 int c=a*b;
	 
	 System.out.println("value of c is :"+ c);
			 
	}
	
	public static void subtraction()
	{
	int a=28;
	int b=23;
	int c= a-b;
	
	System.out.println(c);
	}
		
	public static void division()
	{
	
	
	double c=0.5;
	
	System.out.println(c);
	}
		public static void printHello() 
	{  
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		
		
		addition();
		printHello(); 
		division();
		subtraction();
		multiplication();
		NonStaticMethodDisscussion b = new NonStaticMethodDisscussion();
		
		b.m1();
		b .shub();
		
		StaticMethodDisscussion s= new StaticMethodDisscussion();
		s.addition();
		
		//calling static method types
		//1. same class --- method name
		//2. classname.methodname
		//3. by creating an object and call it throgh ref var.methodname--not recommended
	}
	

	
	
	
	
	 
}
