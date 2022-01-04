package exceptionhandling; //arithmatic exception

public class TryCatchHandling {

	
	public static void main(String[] args) {
		
		int i=10;
		
		int j = 0;
		
		int k;
		
		try //try and catch is  like if-else ( agar try me exception ata hai toh catch chalta hai)
		{
		 k=i/j; //when we have any risky code we have to write it in try block IF THERE IS EXCEPTION THEN NEXT LINE WILL NOT BE EXECUTED AND IT WILL MOVE TO CATCH BLOCK THERE IT WILL TALLY THE EXCEPTION IF EXCEPTION MATCHES CATCH BLOCK WILL RUN IF NOT IT WILL NOT RUN
	               	// no value will be assign to k
		 
		 // here we handled the risky code through bypassing the code and this is exception handling
		}
		
		catch(ArithmeticException e) // THE EXCEPTION WHICH IS WRITEN IN THE PARANTHESIS WILL ONLY HANDLE THAT SPECIFIC EXCEPTION PRESENT IN TRY BLOCK IF IT DOES NOT MATCH IT WILL NOT BE ABLE TO HANDLE THE ABNORMAL EXECUTION IN SUCH CASE CONSOLE WILL SHOW THE ERROR ALONG WITH THE EXCEPTION PRESENT
		{
			System.out.println("catch block is running");
			k =2; // here k will be assign value as 2
			
			// what is "e" inside the blocks
			//--> e is the variable through which we can convey message and the reason behind the error to the user
			
			String message = e.getMessage();// storing the error message into the variable
			System.out.println( "the message is "+message);
			
			
			
			
			
			
		}
		
		System.out.println("the value of k is :"+ k);
		
		int l = k+2; // we can perform any operation on k
		
		System.out.println("the value of l is "+ l);
		
		
		
		
//NOTE--> WE WILL WRITE ALL THE RISKY CODE INSIDE TRY BLOCK AND IMMEDIETLY WE WILL WRITE CATCH WHICH HAS POSSIBLE TYPE OF EXCEPTION	
		//
		
		// HANDLING eXCEPTION USING TRY-CATCH
//1.FIRST CODE INSIDE TRY BLOCK WILL GET EXECUTE
		//2. CATCH BLOCK SHOULD BE THE IMMEDIATE BLOCK AFTER TRY BLOCK AND IT CONTAINS THE POSSIBLE TYPE OF EXCEPTION THAT CAN COME AFTER THE EXECUTION OF TRY BLOCK
		//3.IF THE EXCEPTIONTYPE INSIDE THE CATCH BLOCK DOES NOT MATCH TYPE OF EXCEPTION ARRIVE I THE TRY BLOCK THEN WE CANNOT PREVENT THE PROGRAM FROM ABNORMAL EXECUTION
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
