package methodsdiscussion;

public class CategoriesOfMethod2 {
	//Note- return is used when we have to use the return value for future use by storing it into a varaibl	
// c. method with return type and without argument
	
	public static boolean m1()
	{
		System.out.println("m1 method of boolean return type");
		
		return false;  
	}
	 
	public int m2()
	{
		System.out.println("method with return type without argument");
        int a=12;
        int b=34;
        int v=a+b;
        
        
        return v;
	}
	
	//d. method with return and with argument
	
	  public static String m4(int a, int b, String c)
	  {
		  a=a+2;
		  
		  System.out.println("value of a ="+ a);
		  
		  System.out.println("value of b ="+b);
		  
		  System.out.println(c+"city");
		  
		  return "Pune";
		  
		   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 	
		public static void main(String[] args) {
		  
		 boolean ret = m1();
		System.out.println(ret);
		
		CategoriesOfMethod2 g = new CategoriesOfMethod2();
		   int fvnv = g.m2();
		   
		System.out.println(fvnv);
		
		System.out.println(g.m2());
		
		System.out.println("***************");
		
		 String value = m4(54, 78, "velo");
		
		System.out.println(value);
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}