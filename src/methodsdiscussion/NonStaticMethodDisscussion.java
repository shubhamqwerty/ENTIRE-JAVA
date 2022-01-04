package methodsdiscussion;
 
public class NonStaticMethodDisscussion {

	
	//syntax
	//public void name of method()
//	{
//	
//	}
	
	 
	public void m1()
	{
	System.out.println("i have cleared all interview and have all offer letter");
	}
	
	public void shub()
	{
	int a=34;
	int b=76;
	int c= a*b;
	 System.out.println(c);
	}
	
	
	
	
	
public static void main(String[] args) {
	
	NonStaticMethodDisscussion c = new NonStaticMethodDisscussion();
	c.shub();
	c.m1();
	
	StaticMethodDisscussion.addition();
	StaticMethodDisscussion.subtraction();
	StaticMethodDisscussion.printHello();
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
