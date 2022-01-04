package loopsinjava;

public class WhileLoop {
//  LOOP IS PART OF LOGIC AND is DEFINED IN METHOD
// while loop is used for repetitative purpose like if condition is true then execute if not then not execute	
// we use while loop when we we r nt sure that how many times loop is going to be executed	
	
	
	 
	public static void main(String[] args) {
		
		//syntax of while
		
	//	while(boolean-condition) // here 1st condition will be checked if true then enter loop and run the action
	//	{
			// Actions
	//	}
		
		int a=10;
		
		while(a<100) //this is infinite loop since every time condition is checked and it is true for every time so hello wil be printed infinite times
		{
	       System.out.println("hello");
		}
		
		while(a<12)
		{
			System.out.println("hello");
			a++; // if taken a-- then loop will be infinite since   
		}
		System.out.println("outside the loop");
		
	//homework reversr the no. 12345 to 54321	
		 
		
		
		int s=5;
		while(s<=5)
		{ 
			System.out.println(s);
			s--;
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
