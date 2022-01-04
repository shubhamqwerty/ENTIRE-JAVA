package accessmodifiersClassLevel;

import accessmodifierMethodLevel.A;

/// ONLY TO UNDERSTAND PROTECTED ACCESS MODIFIER 


public class BProtectedAccessModifier extends A {
	

	
	
	
	

	public static void main(String[] args) {
		
		
		A a = new A ();
		a.m4(); // trying to call protected method(outside thepackage) by creating the object of A which is parent class object and it is not possible
		
		// to call the protected method (outside the package)we have to make the object of current class i.e child class  and through it we can call protected method but firstly we have to extend the class in which protected method is present
		// i.e protected method is  accesible outside the package through the child class refrence variable.
		
		 BProtectedAccessModifier bb=new  BProtectedAccessModifier();
		 bb.m4(); // here BProtectedAccessModifier is the child class of A and through refrence variable of A we can call the protected method outside the package
		
		 C c=new C();
		c.m4();// calling proteced method outside the package through the refrence variable of C which is child class of BProtectedAccessModifier 
			
		
		
		//CALLING THE PROTECTED VARIABLE FROM OTHER CLASS
		
		System.out.println(a.f);//  calling a protected variable from other package not possible because we have to call child class refrence variable
		
		System.out.println(bb.f); //proteced variable called from outside package through child class refrence vRIABLE
		 
		System.out.println(c.f); // valid  beacause c is child class of BProtectedAccessModifier
		
		
	}

	
	
	
}
