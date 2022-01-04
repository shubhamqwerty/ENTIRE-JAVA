package methodsdiscussion;

public class CategoriesOfMethod {
	
// a. without return type and without argument
	
	public static void m1() 
	{
	System.out.println("method with no return type and no argument");	
	}
	
	
	
	//b. without return type and with argument
	
	public void m2(int a)
	{
		m1();
	System.out.println("method with no return with argument");
	System.out.println("i value is :" +  a);
	}
	
	
	public static void m3(double d, boolean value)
	{
	System.out.println("value of doule= " + d);
	
	System.out.println("value of boolean= " + value);
	}
			
	public static void addition(int a, int b)
	{	
		int c= a+b;
		
		System.out.println("sum is"+ c);
	}
	
	
	
	public static void main(String[] args) {
		
		
		CategoriesOfMethod obj=new CategoriesOfMethod();
		obj.m2(8);
		m3(9.45745, true);
		addition(24546,4657547);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
