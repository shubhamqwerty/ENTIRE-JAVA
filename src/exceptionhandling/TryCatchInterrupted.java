package exceptionhandling;

public class TryCatchInterrupted {
	
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		
        try
        {
           Thread.sleep(5000); // THREAD IS A CLASS IN JAVA IN WHICH SLEEP IS METHOD WHICH HOLDS(SLEEP MODE) THE EXECUTION FOR MILI SECONDS THAT WE MENTION IN PARANTHESIS
	             	          // THERE MIGHT BE SUCH INSTANCE THAT WHEN THE METHOD IS IN SLEEP MODE AT THE SAME TIME THE METHODS ARE BEING ACCESSED AT SUCH TIMES THERE WILL BE INTERRUPTED EXCEPTION
	   }
		
		catch(InterruptedException e)
		{
		    System.out.println("catch code");
		}
		
		
        System.out.println("second line");
		
		
		
	}
	
	
	

}
