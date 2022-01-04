package polymorphismDisscussion;

public class A {
	
	
	int z=50;  //polymorphism on variables
	
	
	public int m1()
	{
		System.out.println("m1 method from A class");
		
		return 50;
	}
	
	public void m2()
	{
		System.out.println("m2 method from A class");
	}
	
	public void m3()
	{
		System.out.println("m3 method from A class");
	}

	public void m4()
	{
		System.out.println("m4 method from A class");
	}

	 void m4(int k) 
	{
		System.out.println(" method with one argument from A class");
	}

	 
	 public static void m6()
	 {
		 System.out.println(" m6 method from aA class");
	 }
	 
	 
	 public static void main(String[] args) {
		System.out.println("class A main method");
	}
	 
	 
}
