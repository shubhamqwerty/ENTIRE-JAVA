package loopsinjava;

public class ContinueStatement {
	
	
	  public static void main(String[] args) {
		
		  int a=1;
		  
		  while(a<10)
		  {
 			  if(a%2==0)
			  { 
 				  a++;
				  continue; // this keyword will revert back the execution of the same loop again and again
				            // it wont let execute the next line of the program it go the next iteration  
			                // current loop next iteration
			  }            
			  
			  System.out.println(a); // this line wont be executed since CONTINUE keyword will move control to execute the same loop again and again
			  a++;
			  
		  }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
