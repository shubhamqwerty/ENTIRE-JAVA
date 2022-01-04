package polymorphismDisscussion;

public class B extends A {
	
	
	int z=100;
	
	
	public void m1()// ERROR BECAUSE m1() OF A has different return in both the class
	{
		System.out.println("m1 method from b class");
	}
	
//	void m3() // error because scope of m3 is default in B class where as it public in A class that means to be overridden we can increase the scope but cannot decrease the scope
	{
		System.out.println("m3 method from b class");
	}
	
	public void m5()
	{
		System.out.println("m5 from B class");
	}
	
	
	private void m4(int k, int r)//case of overloading by reducing its scope it has no eefect
	{
		System.out.println(" method with one argument from A class");
	}
	
	public static void m6() // here m6 is same but not overrided because static method cannot be overrided -- this is method hiding not overriding since we r tring method overriding //static method follow overloading 
	 {
		 System.out.println(" m6 method from B class");
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	// case 1
		
		B b=new B();
		b.m3();
		
 	b.m6();// class b method
 	
 	//case 2
		A a=new A();
		a.m6();//gives m6() of parent class class a
		
	//case 3
		A aa = new B();
		aa.m6();// gives parent m6() since method is not overrided
		
		//checking polymorphism on variable
		
		System.out.println(b.z);// class B variable i.e 100 through B class ref variable
		
		System.out.println(a.z);//  class A variable i.e 50 through A class ref variable
		
		System.out.println(aa.z);// accessing through A aa = new B(); 50 THIS CALLs THE VARIABLE OF REFRENCE VARIABLE AND NOT THE OBJECT SO IT DOES NOT FOLLOW OVERRIDDING  
// variable does not follow overriding i.e variable cannot be overridden
// OVERIDDEN MEANS = JISKA OBJECT HAI AGAR USKI METHOD CHAL RAHI HAI TAB OVERRIDDING HOTA HAI 
	
		//checking main method is overriding or not
		 aa.main(args); // here main method is called which is from the parent class i.e A class that means MAIN method does not follow overriding this is the case of method hiding
		               //overriding calls the method from the child class when parent ref variable point out the object of child class this is overriding
		 // 
		
		
	}
	
	
	
	
// OVERRIDING WITH RESPECT TO RETURN TYPE
	//RULE --> A METHOD CAN BE OVERRIDED IF AND ONLY IF THE RETURN TYPES IN BOTH THE CLASS IS SAME
	
// OVERRIDING WITH RESPECT TO ACCESS MODIFIER
	// RULE--> FOR AN OVERRIDDEN METHOD WE CAN INCREASE THE SCOPE OF METHOD or keep the same  BY USING ACCESS  MODIFIER BUT WE CANNOT REDUCE THE SCOPE OF METHOD IF WE TRY TO REDUCE WE CANNOT OVERRIDE THE METHOD

// OVERLOADING KA FUNDA
	//RETURN TYPE OR ACESS MODIFIER CANNOT IMPACT TO A METHOD WHICH IS OVERLOADED IN NATURE
   //OVERLOAADED HAS ONLY ONE RULE THAT IS SAME METHOD NAME DIFFERENT SIGNATURE


//STATIC METHOD WITH RESPECT TO METHOD OVERRIDING
	//static method cannot be overrided but if we try to do so it is known as method hiding .Method resolution depends on ref variable if there is method hiding
// static method can be OVERLOADED with different signature












}
