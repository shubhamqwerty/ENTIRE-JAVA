package accessmodifiersClassLevel;
 
//DISSCUSSION OF "final" access modifier

// HERE CHILD CLASS CANNOT EXTEND PARENT CLASS BECAUSE PARENT CLASS HAS DECLARE HIMSELF AS "FINAL"
// SINCE PARENT CLASS IS DECLARED AS "FINAL" THEREFORE CHILD CLASS CANNOT ACCESS THE METHOD AND VARIABLE OF PARENT CLASS

public class Child extends ParentFinal // ERROR BECAUSE PARENT CLASSS IS DECLARED AS "FINAL"  THEREFORE CHILD CANNOT ACCESS THE PARENT CLASS 
//SO IT SHOWS ERROR
	
	public void bike()
	{
		System.out.println("Bike method of child class");
	}
	
	
	public void newGenerationMarry()
	{
		System.out.println("marry suggested by child ");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Child c= new Child ();
		c.car();        // THIS METHOD ARE N0 LONGER ACCISIBLE TO CHILD SINCE PARENT CLASS IS NOW FINAL I.E. CANNOT MAKE CHILD CLASS OF PARENT CLASS
		c.home();      // THIS METHOD ARE N0 LONGER ACCISIBLE TO CHILD SINCE PARENT CLASS IS NOW FINAL I.E. CANNOT MAKE CHILD CLASS OF PARENT CLASS
		c.property(); // THIS METHOD ARE N0 LONGER ACCISIBLE TO CHILD SINCE PARENT CLASS IS NOW FINAL  I.E. CANNOT MAKE CHILD CLASS OF PARENT CLASS 
	
	Parent p=new Parent();
	p.car(); // here parent class method is accesible through regular way though parent class is declared as "final" it is possible due to "public" keyword
	p.home();//
	
	}
	
	
	}
	
	// main mthod is a static method and static method cannot be overidden and when we add FINAL keyword it will have the same meaning as of overridden case
