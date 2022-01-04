package exceptionhandling;
                                               //NULLPOINTEREXCEPTION
public class TryCatch3 {
	
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	
	public void m2()
	{
		System.out.println("m2  method");
		
		Test t = null; // this is just a creation of variable of Test class and storing the value null
		t.m1(); // since t is having the null value so nothing will be executed this is called as nullpointer exeception
		
	}
	
	public static void main(String[] args) {
		
		
		TryCatch3 t3 = new TryCatch3();
		 t3.m2();
		
	//NOTE --> THE TYPE OF EXCEPTION ARRIVES AT THE RUN TIME OF COMPILATION OF CODE WE MUST HANDLETHE EXECPTION WHILE WE CREATING THE CODE THAT CATEGORY IS CALLED CHECKED CATEGORY  Y INFORMATION ABOUT THE TYPE OF EXECUTION WE CAN GET THEN THAT CATEGORY IS CALLED UNCHECKED CATEGORY 	
		//EXAMPLE---> IOEXCEPTION CLASSESS, FILENOTFOUNDEXCEPTION, INTERUPTED EXCEPTION
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
