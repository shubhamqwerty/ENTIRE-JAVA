package polymorphismDisscussion;

public class ParentClass {
	//OVERRIDING METHOD  METHOD NAME AND SIGNATURE BOTH ARE SAME CALLED AS METHOD OVERRIDING along with the methos is return or without return both methods should be compulsory same both should be static or nonstatic along with thier return type
	
	public void home()
	{ 
		System.out.println("Home method of parent class");
		
	}
	
	
	public void car()
	{
		System.out.println("Car method of parent class");
	}
	
	public void property()
	{
		System.out.println("Property method of parent class");
     }

	public void marry()// if this method is declared as final then child cannot make the same method in his class if made it will show error
	{
		System.out.println("Parent class marry  method");
	}
	







}