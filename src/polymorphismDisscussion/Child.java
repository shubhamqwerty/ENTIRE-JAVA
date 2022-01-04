package polymorphismDisscussion;

public class Child extends ParentClass    {
	
	
	
	public void bike()
	{
		System.out.println("Bike method of child class");
	}
	
	public void property(int i)
	{
		System.out.println("Property method of child class");
     }
	
	public void car()
	{
		System.out.println("Car method of child class");
	}
	
	public void marry()
	{
		System.out.println("child class marry  method");
	}
	
	public static void main(String[] args) {
		
		ParentClass p = new ParentClass();
		p.home();
		p.marry();// marry method from parent class since  we have created the object of Parenrclass
		
		Child c=new Child();
		c.marry();// marry method(OVERRIDED) from child class marry are the 2 same method in parent and child class but when we create the object of child class it will access the marry method of himself and not the parent
		c.home();// home(NOT OVERRIDED) from parent class (child extends parent so it can access parent clas method
		c.property(); //(NOT OVERRIDED)

// calling parent class through child object	
	 ParentClass pp =new  Child(); // this is valid because the rule is parent class refrence variable can be used to point child class object
	 
	// Child cc = new ParentClass();  // error because as child class refrence variable cannot be used to point parent class object
//
	 
	//checking which method(overloaded and overrided) are called through ParentClass pp =new  Child();
 	
	pp.property();// ParentClass property(not overrided) method// jyacha CLASS CHA ref variable ahentyanche method call hotat if methods are not overrided// property is not a overrided method
//	pp.property(55);
	pp.home();// home from ParentClass (not overrided)
	
//now cheching which overrided method is called through 	ParentClass pp =new  Child();
	
	pp.marry(); // child class marry method(OVERRIDED) which is overrided method
	pp.car();
	
	//RULE----.> IF PARENTCLASS REF VARIABLE IS POINTING CHILDCLASS OBJECT THEN 2 SCENARIO
	// 1ST. --> IF TWO METHODS ARE NOT OVERRIDED THEN PARENT CLASS REFRENCE VARIABLE WILL CALL METHODS FROM PARENT CLASS 
	//2ND.-----> IF TWO METHODS ARE  OVERRIDED THEN PARENT CLASS REFRENCE VARIABLE WILL CALL METHODS FROM CHILD CLASS
	
	//NON-OVERRIDED METHODS---> METHODS WILL BE CALLED ON THE BASIS OF REFRENCE VARIABLE
	// OVERRIDED METHODS----> METHOD WILL BE CALLED ON THE BASIS OF OBJECTS
	}
	//RUL1-- IN OVERRUDUNG WHICH METHOD GETS EXECUTES IS DEPENDS ON RUN TIME OBJECT
	// OVERIDING IS ALSO CALLED AS RUN TIME POLYMORPHISM
	//OVERRIDING IS ALSO KNOWN AS LATE BINDING
	
	 
	//RUL2 --- IN OVERLOADING WHICH METHOD GETS EXECUTES IS DEPEND ON  REF VARIABLE
    //OVERLOADING IS ALSO KNOWN AS COMPILE TIME POLYMORPHISM
	// OVERLOADING IS ASLO KNOWN AS LATE BINDING



}
