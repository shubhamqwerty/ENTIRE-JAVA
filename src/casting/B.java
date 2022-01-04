package casting; //CASTING WITH RESPECT TO CLASS

public class B extends A {
	
	public  void m1() {
		System.out.println("m1 method from B class");
	}
	
	
	
	public static void main(String[] args) {
		
	
	
	A a = new A(); // object of class A
	
	//UPCASTING
	B b = new B();  // object of class B
	b.m1(); // this will call child class m1 method
	
	
	// now converting the ref variable of B class into class A
	
	 A c = (A)b; // this means A ka ref variable(c) and B ka object // converting b into class A // UPCASTING ( converting b which is of lower order into higher order into A called as upcasting
	c.m1(); //  child class method will be called since overiding taking place
	 
	 
	 
	 
	A aa = new B();// upcasting
	
	// DOWN CASTING
	B bb=(B)a; // child referencs holding parents object this is  invalid // THIS TYPE DOWN CASTING IS INVALID
	bb .m1(); // HERE WE ARE CRATING THE REFRENCE VARIABLE OF CHILD CLASS AND OBJECT OF PARENT CLASS WHICH IS INVLID IN JAVA HENCE WE WILL GET  CLASS CAST EXCEPTION
	
	A h = new B();// a ref variable and  B object
	
	B i = (B)h ; // reference vaiable of B and object of B--> this is valid --> down casting example ( h which is of higher order converted into lower order this is downcasting) // THIS TYPE OF DOWN CASTING IS VALID
	i.m1(); // this wil call m1 from b class
	
	
	// BYTE---> SHORT--> INT--> LONG--> FLOAT--> DOUBLE  THIS CHAIN MECHANISM CANBE  USED FOR  CASTING
	//          CHAR-->	
	
	
	byte n = 54;
	byte l = 40;
     int	m =n+l;
	
	 byte v=(byte)m; //thi s is casting
	 
	 char q = 'a';
	 
	 int w = 1;
	 
	 int t = w+q;
	 
	 System.out.println(t); // 98
	 
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	 
	
	
	
	
	
	

}

  // CASTING INTERMS OF NON PRIMITIVE (CLASSES)
// RULE 1 --->TO CAST THE CLASES THERE MUST BE RELATIONSHIP BETWEEN THE CLASSES
// RULE 2 ----> WE CAN CAST A LOWER ORDER(CHILD CLASS REFERENCE VARIABLE) TO HIGHER ORDER (PARENT CLASS REFERENCE VARIABLE) AND VICE VERSA

// THERE ARE TWO TYPES OF CASTING INTERMS OF NON PRIMITIVW
//1. UPCASTING(generalization)---> WHENEVER WE CAST LOWER ORDER(CHILD CLASS REF VARIABLE) TO HIGHER ORDER (PARENT CLASS REF VARIABLE) IS CALLED UPCASTING ALSO KNOWN AS GENERALIZATION
// 2 DOWNCASTING(specialization) --->M WHENEVER WE CONVERT HIGHER ORDER (PARENT CLASS REF VARIABLE) TO LOWER ORDER (CHILD CLASS REF VARAIBLE) THEN THIS IS CALLED AS DOWN CASTING ALSO KNOWN AS SPECIALIZATION
                  //// HERE WE ARE CRATING THE REFRENCE VARIABLE OF CHILD CLASS AND OBJECT OF PARENT CLASS WHICH IS INVLID IN JAVA HENCE WE WILL GET  CLASS CAST EXCEPTION