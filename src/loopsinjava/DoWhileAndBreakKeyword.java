   package loopsinjava;

public class DoWhileAndBreakKeyword {
	
	
	// in while loop 1st condition is checked if true then executed
	// but when we have to run a block (at least once) though condition is wrong(of while loop) we use DOWHILE LOOP
	// we   use DOWHILE loop when we are sure that loops going to be executed atleat once
	
	public static void main(String[] args) {
		
		//syntax of do while
		
//     	do
//		{
//			Actions
//		}
//		while(boolean-condition);
//		
//		do
//		{
//			System.out.println("hello");
//		}
//		while(1>2);// though condition is wrong it will execute once
//	       // if condition is true then it will execute infinite times
//		
		
//		int a=20;
//		int b=30;
//		do
//		{
//			System.out.println("hello");
//			
//			
//		}
//		while(a<b);// will point 10 times until  value of a is 30
////		
		System.out.println("************************");
		
	// BREAK CONCEPT-------->>>>
	// use to brake the loop
	// break is used with conditional i.e. with(if else loop) but not neccessary it can be used single	
	// break statement can be used inside the loop
	// break can be used in while ,dowhile,for loops	
		int N=20;
		int M=30;
		do
		{
			System.out.println("hello");
			
			N++;
			if(N==25)
			{
				break;// here when N value reaches 25 then it wont go to while loop it will terminate  the current loop and will come out from the loop 
			}         //BREAK is used inside the loop
			System.out.println("after break");// this line will not be printed when N=25 since at N=25 loop will be terminated
		}
		while(N<M);
		
		System.out.println("after the loop"); // after N=25 then it will execute next line which is outside the loop
		
		

		
		
//		if(N==25)
//		{
//			break; // ERROR beacause BREAK CANT BE USED outside the loop
//	    }
//		
		
	}
	
	
	
	
	
	
	
	
	

}
