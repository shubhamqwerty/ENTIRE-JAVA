package accessmodifiertestpackage;

import accessmodifierMethodLevel.MethodAccessModifier;
import accessmodifiersClassLevel.Public;
import accessmodifiersClassLevel.variableaccessmodifier;


public class AccessTest {
	
	public static void main(String[] args) {
		 
		
		Public t= new Public ();
		Public.m1();// "public" keyword can also access the class from other class along with the method and variable present in it
		
		Default t3 =new Default();// error because Test3 class(which is default class) is outside the package  and default class is not accesible outside the package
		
		//caling method from other class with different access modifier(0f method level)
		// a. public access modifier
		
		MethodAccessModifier.m1(); 
		
		//b.default access modifier
		
		MethodAccessModifier mam = new MethodAccessModifier();
		mam.m2(); // error because m2 method is not accessible because it is default which is accessible only iside the package
		
		// c. private access modifier
		
		mam.m3(); // error because m3 method is private hence we cannot use it in another class except in the same class
		
	
		//caling variable from other class with different access modifier
		
		//a. public access modifier
                     variableaccessmodifier v=new variableaccessmodifier();
                 System.out.println(v.a); //a is a public variable inside method access modifier class
	
	// b. <default> access modifier class
                 System.out.println(v.b);// error because b is a default variable and default variable is accessible only inside the package and not outside the package
	
                 
    //c. private access modifier
	System.out.println(v.s); // s is private so s is accessible only inside the class and not outside the class
	
	
	
	
	
	}
	

}
