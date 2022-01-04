package varaiblediscussion;

public class LocalVariableDiscusion {
	
	int i = 10; //non static varaible defined at class level
	
	
	
	
	public static void main(String[] args)
	{
		
		int i=19; //local variable difference is local varaible is for a specific method(method level )
		          //whereas static varaiablr is for entire class(class level) i.e static is accessible throughout the class but local is only for specific method
	
		LocalVariableDiscusion lv =new LocalVariableDiscusion();
		lv.m2(); ////23 
				
		int r;
		//System.out.println(r);
		m1();
		
	}
	
	public static void m1()
	{
		int a=50;
		int b=48;
		int c=a+b;
				
				System.out.println(c);
				
				int d; // d is local varaiable and  JVM  does not store default value in local varaible we compusarily have to assign the value in it.
				
			//	System.out.println(d );// error because d does not have any value not even a default value.
	
	
				int x ; //declaration or defination
				
				x=12; //assignation  or initialization
				
				int e=2; //declaration and assignation at same time
	
	System.out.println(x); //utilization
	
	
	
	  if(true) // JVM will execute only when condition in round braces are true
	  {
		  int k =27;
		  System.out.println(k);
		  System.out.println(a);// here a is accesible because if a parrt of m1 method so a is accesible in any curly braces(method) which is inside m1 method
	  }
	
	//  System.out.println(k);// k is not accesiblr here beacause we accesing it outside if's curly braces since k is local variable
}
	
	// varaiable at class level is  called global level
	// varaible at method level is called local variable /variable for a specific block//define in 2 curly braces IS NOT ACCESIBLE OUTSIDE 2 CURLY BASIS
	
	
	
	public void m2()
	{
		i=23;
		
		System.out.println(i); //23 local variable
		
		System.out.println(this.i);//10
		// to access non static variable inside a non static method we have to use THIS keyword
		}
	
	
}

