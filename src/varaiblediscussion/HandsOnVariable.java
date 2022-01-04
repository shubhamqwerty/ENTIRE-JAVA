package varaiblediscussion;

public class HandsOnVariable {
	
	
	int i=50;
	
	static int j =20;
	
	public void m1()
	{
		int i = 10;
		int j= 30;
		 System.out.println(i);// local variable --10
		 System.out.println(this.i);//non static variable ---50 //calling non stattic variable in nonstatic method
		 
		 System.out.println(j); //local variable---30
		 
		 
		 System.out.println(HandsOnVariable.j);//static variable---20  //calling static variable in nonstatic method
		 System.out.println(this.j);// warning because j is ststic and we have called it in nonstatic way
	}
	
	
    public static void m2()
     {
	    int i=100;
	    int j=200;
	    
	    System.out.println(i);// local variable---100 //
	    
	    //to call non static variable in static method we have to make object
	    
	    HandsOnVariable z =new HandsOnVariable();
	    System.out.println(z.i);//non stativ variable---50 // called non static variable in static method
	    
	    //to call static variable in static method(class name.variable name
	    
	    System.out.println(HandsOnVariable.j);// static variable---20
	    
     }
	
	
	public static void main(String[] args) {
		
		HandsOnVariable z= new HandsOnVariable();
		z.m1();
		System.out.println("*******************");
		m2();
		
		
	}
	
	

}
