package interfacedicussion;

public interface Interface2 {

	public void m4();
	
	public void m5();
	
	public void m70(); // two methods m70 of same name in interface1 and interface2 but when the class will implements these 2 methods it will implements only once(i.e. only once m70 method will be called in the class)
	
	
	public static void m2()
	{
		System.out.println("Static method in interface2");
	}
	
	
	 int j = 100;
	
	
	
	
	
	
	
	
}
