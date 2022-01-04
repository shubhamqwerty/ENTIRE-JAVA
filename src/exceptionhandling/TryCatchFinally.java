package exceptionhandling;

public class TryCatchFinally {
	
	
	public static void main(String[] args) {
		
		try
		{
		String s=null;
		String ss ="abc";
		
		s.equals(ss);// this will be nullpointexception since we comparring null with abc
		            // this is risky code
		// "equals" is used with string data type .. if == is used with string it means we r checking that refrence variable are equal or not(s==ss -->false)
		// to check the contents in variable we use "equals" 
		
		}
		catch(ArithmeticException e)// this wil not handle the above exception
		{
			System.out.println("arithmatic exception catch block");
		}
		finally// final block will execute every time whether the exception is handled or not handled and it will come after the catch block 
		    //and there cant be anymore final block after  block . final block is optional for try-catch but block is mandatory to have try before it.
		{	
		System.out.println("finally block after catch ");
		try {
			System.out.println();
		}
		catch(Exception e) {
			
		}
		
		
		
		}
		
		
		
		
		
		
	}
	
	
 //finally is for clean-up activity
//try is handle the risky code and that risky code is handle by catcg block
	
	//what is difference between final,finally and finalize?
	//final---> is a keyword (access modifier) which is applicabe for class, method and variable
	//finally---> it is block which is used in exception hadling
	//finalize --> it is a method which is used by te garbage collector to destroy the unused object
	
// NOTE--> THERE CAN BE FINALLY BLOCK AFTER THE TRY BLOCK BUT AFTER FINALLY THERE CANT BE CATCH BLOCK
	//TRY-FINALLY-->VALID
	//TRY-CATCH-FINALLY---> VALID
	//TRY-FINALLY-CATCH--->INVALID
	// ONLY TRY----> INVALID
	
// WE CAN ALSO DEFINE TRY-CATCH BLOCK INSIDE THE TRY-CATCH BLOCK	
// 	 WE CAN ALSO DEFINE TRY-CATCH BLOCK INSIDE THE finally BLOCK
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
