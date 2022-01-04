package inheritancediscussion;


// INHERITANCE OF CONSTRUCTOR
//CONSTRUCTOR DOES NOT FOLLOW INHERITANCE

public class ChildConstructor extends ParentConstructor
{   int i=87;

	public ChildConstructor() //ERROR BECAUSE  PARENT CLASS CONSTRUCTOR HAS ONE ARGUMENT CONSTRUCTOR AND THIS  ZERO ARGUMENT CONSTRUCTOR  CAN'T ACCESS PARENT CLASS ONE ARGUMENT CONSTRUCTOR AUTOMATICALLY 
	{ super(56); // so to access parent CLASS ONE ARGUMENT CONSTRUCTOR WE HAVE TO USE "super" KEYWORD IFBLANK BYDEFAULT IT WILL CALL ZERO ARGUMENT CONSTRUCTOR
		System.out.println(" constructor from child class");
	}

	
	public ChildConstructor(int i)
	{ //super(12);// called parent class constructor in child class
		System.out.println(" constructor of child class WITH ONE ARGUMENT");
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
 ChildConstructor cc= new ChildConstructor ();//IN (1) OUTPUT 1ST IT WILL CALL GRANDPARENT CLASS CONSTRUCTOR THEN  PARENT CLASS CONSTRUCTOR THEN CONSTRUCTOR 
                                               // child will call parent and parent will call grandparent
	//(when  int i   is used) here  ZERO ARGUMENT CONSTRUCTOR SHOULD ACCESSS  ZERO ARGUMENT CONSTRUCTOR OF PARENT CLASS CONSTRUCTOR BUT IT DOES NOT  SO CONSTRUCTOR DOES NOT FOLLOW INHERITANCE
// ERROR BECAUSE WHICH SAYS CONSTRUCTOR OF ZERO ARGUMENT IS NOT DEFINED IN CHILD
	// IF
 
 
//  ChildConstructor xx= new ChildConstructor (64);
 
 int i=13;
 
 System.out.println(i);//13
System.out.println(xx.i);//87

ParentConstructor pp = new ParentConstructor();//
System.out.println(pp.i);//67

	}
	
}
