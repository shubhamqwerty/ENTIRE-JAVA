  package exceptionhandling;

//EXCEPTION IS USED FOR NORMAL EXECUTION WHEN WE USE A RISKY CODE
//ALL THE EXCEPTION ARE CLASS IN JAVA

public class Test {
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		System.out.println("main method is starting");
		
		int i=10;
		
		int j =0;
		
		int k =i/j; // HERE THE CODE WILL BREAK AND WILL NOT EXECUTE THE NEXT LINE SINCE THE ARITHMATIC OPERATION IS NOT DEFINE THIS IS AN EXCEPTION
		
		System.out.println(k);
		
		System.out.println("this is last line of main method"); //if the program is normally terminated then this line should be printed
		// since this program will get terminated in  between we called it as abnormal termination
		// if we know that that there will be abnormal termination in that case we will try to handle the exception 
		
		
	// RUN-TIME EXCEPTION   ---->WHEN WE DONT GET ANY ERROR WHILE PROGRAM IS BEING WRITTEN BUT WHEN EXECUTED IT SHWS THE ERROR THIS IS CALLED RUN TIME EXCEPTION
		
	// 	COMPILATION EXCEPTION  --->WHEN WE GET ERROR MESSAGE AT THE TIME OF COMPILATION OF PROGRAM IS CALLED AS COMPILATION EXCEPTION
	
		// THE WAY WE HANDLE THE EXCEPTION INSIDE A PROGRAM WHICH HANDLE IT EVEN AFTER ABNORMAL CONDITION ARRIVES IN THE CODE IS CALLED EXCEPTION
	// EXCWPTION IS USED FOR NORMAL EXECUTION WHEN WE USE A RISKY CODE	
	}
	

}
