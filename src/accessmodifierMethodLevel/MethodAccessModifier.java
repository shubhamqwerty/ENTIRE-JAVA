package accessmodifierMethodLevel;

// DISSCUSION OF "PUBLIC" ACCESS MODIFIER AT CLASS LEVEL


public  class MethodAccessModifier {
	
	//a.public method
	public static void m1() // method with "public" keyword is accessible anywhere in package throughout the project provided class should be "public"
	                       // if class is accessible then only the methods wil be accesible
	                      //  if the class is not public then methods inside it is not accessible outside the package but can be accesible in the same package
	
	{
		System.out.println("m1 method of method level access modifier");
	}
static int bb()
{
return 98;	
}
	
	//b.<default> method ---default has no keyword
	
	void m2() // is accessible only inside the package and not outside the package
	{
		System.out.println("m2 method which is defaut in nature from accessmodifiermethodlevel pacakage");
	}
	
	// c. private
	
	private void m3() // method which are private is accessible only inside the class and not outside the class
	{
		System.out.println("m3 method which is private from MethodAccessModifier class ");
	}
	
	// d. protected modifier
	
	protected void m4() //can be access in the same package directly through parent refrence variable but to call outside the package we have to call through child class reference variable of the existing class 
	{
		System.out.println("m4 method is protected method from MethodAccessModifier class");
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		MethodAccessModifier m = new MethodAccessModifier();
		m.m3();
	}
	
	
	
	
	
	
	
	
}
