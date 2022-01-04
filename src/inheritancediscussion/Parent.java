package inheritancediscussion;

public class Parent  extends GrandParents{
 
	double land=2.5;
	
	double grandland;
	
	 static int a =23;
	 int b =50;
	 int c=33;
	public void home()
	{ 
		System.out.println("Home method of parent class");
		
	}
	
	
	public void car()
	{
		System.out.println("Car method of parent class");
	}
	
	public double property()
	{
		System.out.println("Property method of parent class");

       grandland=super.land; // accessing the vaiale fron grandparents class

	return grandland;
			}
	
	
	public static void main(String[] args) {
		
		Parent p= new Parent();
		
		p.car();
		
		
		Child c = new  Child(); // SINCE child class have the access of parent class so by creating the object of child class and through object of child class we can call methods of parent class
		c.bike();
		c.car(); // accessed with the help of child class object(though in the same class)
		c.home();
		c.property();
		 
		farm();// since it is static method and Parent class has  the access of grandparents
		// no need to write class.method name can be called directly since extends is use
		// 
		GrandParents.farm();//can also be called through regular way
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
