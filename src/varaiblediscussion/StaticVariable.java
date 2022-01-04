package varaiblediscussion;

public class StaticVariable {
	//a.STATIC VARAIBLE
	
	static int i = 10;
	
	public static void main(String[] args) {
		// accesing the stattic varaible
		
		
		System.out.println(i );// 1st way to access
		
		System.out.println(StaticVariable.i);// 2nd way to access
		
		//i;//simply cannot be accesed perform any operation on it or print or do anything
		
		i=i+2;//to change value of varaible 
		System.out.println("upadted i value is"+ i);
		
		m1();
		
		StaticVariable refvar = new StaticVariable();
		refvar.m2();
	}

	public static void m1()
	{// calling statc varaible into static method we can call directly
		System.out.println(i);
	}
	
	
	public void m2()
	{// calling statc varaible into nonstatic method we can call directly
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	
	
	
}
