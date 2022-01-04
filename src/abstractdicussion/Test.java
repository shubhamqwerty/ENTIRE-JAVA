ticpackage abstractdicussion;
 //ABSTRACT ACCESS MODIFIER  =  WE CAN DEFINE SUCH METHOD Which are complete AND THE METHOD which are incomplete  WE CAN DEFINE METHODS/CLASS AS ABSTRACT


// HERE WE CAN WRITE abstract public/public abstract both of them are  valid
public abstract class Test {

	
	public Test()
	{
		System.out.println("constructor of Test class");// we can define the  constructor in the ABSTRACT CLASS BUT IF WE HAVE TO CALL IT  WE HAVE TO CALL IN THE CHILD CLASS THROUGH OBJECT CREATION OF CHILD CLASS(there is aconcept that when we crate the object of child class it will bydefault call the parent class
	}
	
	
	public void m1()
	{
		System.out.println("m1 method is running");
	}
	
	public void m2()
	{
		System.out.println("m2 method is running");
	}
	
	public void m3()
	{
		System.out.println("m3 method is running");
	}
	
	
	public abstract void m4(); //since we dont have the actual implementation we can define its name i.e we r not sure about the functionality. the functionality or method which is not clear must also be declared as ABSTRACT
	                          //i.e. incomplete declaration of method means declare only the name without curly braces (body)  IF WE GIVE BODYI WILL SHOW ERROR
	public abstract void m5();
	
	public abstract void m6();

	
	//public abstract static void m7();// we cannot have static method as ABSTRACT BECAUSE STATIC METHOD DOES NOT REQUIRE THE OBJECT TO BE CALLED AND CAN BE CALLED DIRECTLY( SUPPOSE IF POSSIBLE STATIC METHOD WHICH IS INCOMPLETE CAN BE  CALLED BUT WHEN EXECUTED IT WILL NOT SHOW ANY OUTPUT SO THE STATIC METHOD CANNOT BE ABSTRACT
                                    // STATIC METHOD IS INVALID IN ABSTRACT CLASS
public static void main(String[] args) {
	
	Test t=new Test (); // ERROR BECAUSE WE CANNOT MAKE THE OBJECT OF THE  ABSTRACT CLASS UNCLESS OBJECT OF THE CLASS IS MADE WE CANNOT CALL THE METHODS
	t.m4();            // here  m4 and m2 methods cannot be called since object cannot be formed of the abstract class
	t.m2(); // REASON WE CANNOT CREATE THE OBJECT OF ABSTRACT CLASS BEACAUSE WE CAN HAVE COMPLETE OR INCOMPLETE METHOD WHICH CAN BE CALLED BY USER THAT CAN CREATE CONFUSION TO COMPILER (SUPPOSE OBJECT CREATION IS POSSIBLE AND THE INCOMPLETE METHOD ARE CALLED BY USER IT WILL NOT HAVE ANY OUTPUT SINCE THE METHODS R INCOMPLETE 
	
    }


}
 
// ABSTRACT = A KIND OF MODIFIER WHICH PROVIDE A FUNCTIONALITY TO A CLASS TO HAVE COMPLETE AS WELL AS INCOMPLETE METHODS 
// WHEN WE DEFINE A METHOD ABSTRACT IT WILL REMINDS US TO COMPLETE THE IMPLEMENTATION TO THE INCOMPLETE METHOD
// ABSTRACT IS MODIFIER WHICH IS APPLICABLE TO CLASS AS WELL AS METHOD
//THE METHOD WHICH IS ABSRACT WE CANT DEFINE ITS BODY



// ABSTRACT CLASS ALLOWS COMPLETE AS WELL AS INCOMPLETE METHODS IT IS NOT COMPULSORY TO BE ABSTRACT METHOD ONLY 
// WE CAN ONLY DEFINE THE METHOD AS ABSTRACT ONLY WHEN THE CLASS IS ABSTRACT  WHEN WE DECLAE THE METHOD AS ABSTRACT IN A NORMAL CLASS IT WILL BE ERROR
// we cannot declare variable as abstract since variable cannot be either complete or incomplete  but we can make variable in abstract class
//

// 1. we have a final class which has abstract method.----> invalid because some methods may be incomplete and to complete those method we have to create the child class but when we declare the class as FINAL we cant make the child class of it

//2. we have an abstract class which has final method .----> valid because when we declare the class abstract it is not neccesarry to have the method abstract only we can have any type of method in abstract class
   // the method which is declare as final in abstract class means it will have the implementation but it cannot be override

//3. we have a method which is final and abstract both ----> invalid --> cannot use final and abstract together as final is preventing a method to get override and abstract method always in need to get override inorder to provide implmentation