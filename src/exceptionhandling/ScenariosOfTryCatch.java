package exceptionhandling;

public class ScenariosOfTryCatch {

	public static void main(String[] args) {
	
		// IF WE ARE NOT SURE ABOUT WHICH EXCEPTION WILL OCCUR AT SUCH INSTANCE WE CAN WRITE MULTIPLE CATCH BLOCK 
	try
	{
            int i=10;
            int j=i/5;
            
            
            String s="abc";
            
            char ss=s.charAt(3); // this tells us to give the value of 3rd index and this type of exception is handle in stringoutofbound exception 
           
      }
	
	catch(NullPointerException e) // if this catch block is not able to handle to exception it will go the next catch block AND IF BOTH CATCH BLOCK IS NOT ABLE TO EXCEPTION THEN PROGRAM WILL TERMINATE IN ABNORMAL MANNER 
	{
		System.out.println("null pointer exception");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Arithmatic Exception Catch Block");
	}
	catch(StringIndexOutOfBoundsException y)
	{
		System.out.println(y.getMessage());
	}
	
	
	
	
	catch(Exception w) // this is dead code and compulsorily should be written at last if none of catch block  matches the exception then this will run
	{
		System.out.println("Exception catch block");
	}
	
}
	
// NOTE-->1. WE CAN HAVE MULTIPLE CATCH BLOCK ASSOCIATED WITH ONE TRY BLOCK
	// BELOW TRY IMMEDIARE BLOCK SHOULD BE CATCH IT IS COMPULSORY
//2.IF ANY CATCH BLOCK DOESNT MATCH WITH THE TYPE OF EXCEPTION THEN THE PROGRAMM GETS TERMINATE ABNORMALLY
//3. we always keep exception catch block at the last in terms of catch block because if any of the catch doesn't get match then exception catch block will handle the exception	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
