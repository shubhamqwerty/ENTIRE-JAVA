package interfacedicussion;

// IN INTERFACE EVERY METHOD COMPUSORILY HAS TO BE INCOMPLETE
// INTERFACE DOES NOT HAVE ANY LOGIC 
//INTRFACE IS THE PLACE WHERE THE RULES ARE MADE  AND CLASS IS THE PLACE WHERE THOSE RULES ARE IMPLEMENTED(i.e. methods are overridden) ACCORDINGLY
// implements means to define a body and logic into it

public interface Interface1 {
	
	
	 void rule1();//  IN INTERFACE EVERY METHOD IS BYDEFAULT PUBLIC AND ABSTRACT   AND IT IS ACCESSIBLE THROUGH OUT THE PACKAGE
     abstract void rule1();// these 4 are one and the same i.e. has same meaning
	public abstract void rule1();
    public void rule1();

	public void m1();// accessing these methods in methods test class of method disscussion pakage
	
	public void m3();
	
	
	public void m70();
	
	public static void m2()
	{
		System.out.println("Static method in interface1 ");
	}
	
	public static void main(String[] args) {
		 m2();// calling the static method from same class
	
	j=55; //errror because j variable in interface is final(we cannot reassign the valur to it) and static
	
	}
	
// public abstract static void m2() ;//static method cannot be define incomplete i.e. we cannot use abstract with static, 

	
	
	
	                                     // VARIABLE DIICUSSION IN INTERFACE
	
 int j = 50; // IT IS STATIC VARIBLE SINCE J IS IN ITALIC FORMAT
//	final int j=50;
//	static final int j=50;// three of them has the same meaning
// public static final int j =50;	
 
	//NOTE---> EVERY VARIABLE DECLARED IN INTERFACE IS BYDEFAULT "STATIC" , "FINAL" AND "PUBLIC"
	// these variable which are declared as final are also accessible in other class
	
	
// if we have same variable name inside 2 interfaces then we have to access them by interfacename.variablename  inside the method	
	
	
 }
// whenever we have a client and service provider relationship then we have to define interface in java
// inside an interface we have certain rules that has to be followed by classes who are implementing it
//RULE 1 --> ALL METHDS INSIDE THE AN INTERFACE IS BY DEFAULT PUBLIC AND ABSTRACT WHETHER WE DEFINE IT OR NOT. SO WE CANNOT DEFINE BODY OF METHOD(NON-STATIC) INSIDE AN INTERFACE
// RULE 2 ---> SINCE WE HAVE TO PROVIDE THE IMPLEMENTATION OF THE INCOMPLETE METHODS IN ANOTHER CLASS (that means the methods has to be overridden) BUT STATIC METHOD CANNOT BE OVERRRIDEN THEREFORE WE CANNOT USE INCOMPLETE STATIC METHODS (if used we have to provide the body as if it is a normal static method)
// inside an interference we can have complete body of static method because it cannot be overridden 