package inheritancediscussion;
 
// INHERITANCE --> BAPACHI PROPERTY PORALA
// INHERITANCE is used when there are some common logics/methods which are used everywhere in the project and we can access them through inheritance concept(through EXTENDS keyword)  them  which allows to access other class methods/logic by creating single object(if nonstatic)
// REUSABILITY OF CODE IS DONE
//EXTENDS KEYWORD  makes 2 different class as 1 class--- so we can call anything from one to another as if they are in the same class 


//         1st class     2nd class
public class Child extends Parent
{
	double land=4.5;
	
int b =54;
// EXTENDS KEYWORD USE ---> here when we use EXTENDS keyword between 2 classes then 1st class will have access of 2nd class(including the methods) and this is called as INHERITANCE
	
	public void bike()
	{
		System.out.println("Bike method of child class");
		
		System.out.println(b);// this is variable from child class which is nonstatic so we can access it in the same way as non stattic variable
	                           // this b is from child class
	System.out.println(this.b);// b variable from child class
	
	System.out.println(super.b);// b variable from parent class
	// SUPER keyword is used when the variable of  parent and child class has same name and we have to access the CLASS LEVEL non static variable of parent class into child class(nto non static variable) SAME SCENARIO WITH THE CONSTRUCTOR
	// THIS  keyword is used when non static variable at class level and the local level variable of same class has same name and we have to access the class level non static variable in any non static method at such time we use THIS keyword
// SUPER and THIS keyword is used in non static area
	System.out.println(super.c);
	System.out.println(c);
	  System.out.println(grandland);
	}
	
	
	public static void main(String[] args) {
		
		
		  Child c = new Child ();
		  c.bike();
		  //c.property(); // called from another class without creating the  seperate object of other class this is due to the concept called INHERITANCE
		  c.home();     // EXTENDS keyword provide access of all method and logic  of PARENT CLASS to CHILD CLASS 
		  c.car();
		  System.out.println(a); // varaible from parent class to child class  directly called without writing classname.variablename 
          System.out.println(c.grandland);// child class accessing the variable from grandparent class
	
	System.out.println(c.property());
	c.bike();
	
	}
	
	
	
	
	}
