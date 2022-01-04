  package accessmodifiersClassLevel;

  //discussion of "FINAL"  acess modifier
  // RULE -----> WHEN WE DECLARE A PARTICULAR CLASS AS FINAL WE CANNOT MAKE THE CHLD CLASS OF THAT METHOD BUT THE SAME CLASS CAN BE ACCESSIBLE ANYWHERE BECAUSE OF "PUBLIC" KEYWORD
  // "final" keyword is used when we dont have to make a child class of the existing class
  // when "final" is used in a class(A) that class(A) can be child class of anyother class but class(A) cannot make its own child class
  
  
public final class ParentFinal {
	
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
	
	
	public static void marry()
	{
		System.out.println("this is marry method suggested by parent");
	}
	
	// IF THE SYNTAX IS LIKE
	  final class Parent //----> this class is accessible  in same package but not outside the package and cannot make the child class class of Parent class due to "final" keyword
                         //  "Public" keyword allows the class to be accessible anywhere inside the project
}
