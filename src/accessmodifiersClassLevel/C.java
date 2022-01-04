package accessmodifiersClassLevel;

public class C extends BProtectedAccessModifier{
	

	
	public static void main(String[] args) {
		
		BProtectedAccessModifier b=new BProtectedAccessModifier();
		b.m4(); // calling protected method through the object of  BProtectedAccessModifier which is parent class object 
		
		C c=new C();
		c.m4();// calling proteced method outside the package through the object of C which is child class
		
		// calling a protected variable
		 System.out.println(b.x);
		
		
	}
	
	
	
	
}
