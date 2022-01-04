package loopsinjava;

public class LoopWithBreak {
	
	//NESTED LOOP --- loop k andar loop called nested loop 	
			// to give label to particular loop it is like LABELNAME:	
	         // label is used to perform a particular action on the basis of inner loop
	public static void main(String[] args) {
		
		outerforloop: for(int j=1; j<=5; j++)  //this is nested for loop similarly there can be nested while loop
		{
	innerforloop:		for(int i=1; i<=5; i++)
			{
				System.out.print("*");
				// break outerforloop;    //OUTERFORLOOP is the label/name given to outerforloop
                                          //BREAK KEYWORD with the label provided will terminate the entire outerforloop which includes innerfor loop
				                          // same is with BREAK INNERLOOP THIS TERMINATE ONLY INNERLOOP I.E innerforloop will run only once
				
				continue outerforloop ; // here continue will revert back execution to outerforloop
			}
			
			System.out.println();
		}
		
	
		
		
		
	
			
			
			
			
			
			
			
		}
	
}

	

	