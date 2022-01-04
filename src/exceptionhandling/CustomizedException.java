package exceptionhandling;
// here we are using the exception that we have created
public class CustomizedException {

	public static void main(String[] args) {
		
		boolean syllabusPending = true;
		
		if(syllabusPending==true)
		{
			System.out.println("Now calling classONSunday");
			
			throw new ClassOnSundayException("There is no option please attend!"); //this wil be shown as a message
		}
		
		else if (syllabusPending==false)
		{
			System.out.println("there is no need to take class enjoy!");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
