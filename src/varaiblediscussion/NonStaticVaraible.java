package varaiblediscussion;

public class NonStaticVaraible {
	
	int i = 50; //here nonstatic varaible is directly represented by data type

	public static void main(String[] args) {
		//to acceess nonstatic varaible we have to make object
		
		NonStaticVaraible var = new NonStaticVaraible();
		
		System.out.println(var.i);
		
		System.out.println("*******************");
		
		m1();
	}
	
	public static void m1()
	{//calling  non static varaible into static method we have to create object
		
		NonStaticVaraible obj = new NonStaticVaraible();
		
		System.out.println(obj.i);//50
	
		//to change value of i to 60
		
		obj.i =60;//accss i value and changing it
				
				System.out.println("updated value of i is"+ obj.i);
				
		NonStaticVaraible obj1 = new NonStaticVaraible();
		
		System.out.println(obj1.i);//50
		
		obj1.i=70;
		
		System.out.println(obj.i);//60
		
		System.out.println(obj1.i);//70
		
	}
	 public void m2()
	 {// calling nonstatic variable into nonstatic method we dont have to create object
		 System.out.println(i);
	 }
	
	
	
	
	
	
	
	
	
	
	
	
}
