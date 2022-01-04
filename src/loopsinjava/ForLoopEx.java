package loopsinjava;

public class ForLoopEx {
	//*****
	
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
		System.out.println("*");	// ouyput will be one below the other
		}
		
	System.out.println("KKKKKK");	
		for(int i=1; i<=5; i++)
		{
		System.out.print("*");	// ouyput will be in one straight line
		}
		
	System.out.println("hhhhhhh");
	
	
		//*****
		//*****
		//*****
		//*****
		//*****
	
	for(int j=1; j<=5; j++)
	{
	
		for(int i=1; i<=5; i++)
	       {
	         System.out.print("*");	// ouyput will be in one straight line
	       }                           // to get the above output we need to run the code 5 times so we have write one more for loop for existing for loop
		System.out.println();// this will change the line after printing ***** once
	}	
		
		
//	*
//	**
//	***
//	****
//	*****
	
	
	
	
	
	
	
		
		
		
	}//

}
