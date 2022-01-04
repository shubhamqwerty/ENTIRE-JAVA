package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Throws handle compile time error with respect to the type of exception but we cannot prevent the program to get terminate abnormally using throws keyword
public class Throws {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException //Exception 
	{
		
		System.out.println("this is first line");
		
		int i= 10/0;
		
		System.out.println(i); // this a exception but will not be handle by throws keyword though we mention the type of exception it will lead to abnormal execution i.e throws can handle only the compile time error regarding exception and not the run time execution(try-catch can handle run time execution)
		
		System.out.println("2nd line");
		
		Thread.sleep(5000);// a red will occur below the Thread.sleep(5000) to remove that error we use throws and this is called complation error(means when we type at that time only it will show error)
	                      // to handle this exception we use "interuptedException"
		
		FileInputStream fis=new FileInputStream("nghnbvmnvgfn");// to handle this exception we will use "filenotfound" exception after the throws above
		
//NOTE- IF WE HAVE TO HANDLE ALL TYPE OF EXCEPTION WE HAVE TO WRITE"EXCEPTION " AFTER THROWS	
	
	}
	
// throws keyword used with interuppted and compile time	
	
	
	
	
	
	
	
	

}

//throws keyword does not handle the exception occured like the try-catch block it will lead abnormal execution
//we use throws when we are sure that there is not any exception to get occured at such instance we use throws keyword
// we use try-catch block when we are not sure that there can be or cannot be exception to get occured at such instance we use try-catch block to save the program from exception