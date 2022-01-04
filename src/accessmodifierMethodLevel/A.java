package accessmodifierMethodLevel;

public class A {

	protected void m4()
	{
		System.out.println("m4 method is protected method from A class");
	}

protected String f= "jai shree mataji  "; //it is  protected nonstatic variable
	
	public void protect()
	{
		System.out.println(f); // nonstatic variable can be directly called into nonstatic method
	}
	
	
	
	
	
	
}
