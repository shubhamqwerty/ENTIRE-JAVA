package exceptionhandling;
//THROW KEYWORD IS USED WHEN WE HAVE TO DELIBRATELY BRING THE EXCEPTION
public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		
		System.out.println("b4 exception");
		
		throw new NullPointerException("jan bhujkar laya gaya exception");// when this line will get executed at that point programme will be terminated abnormally
	                                                                 	// what we write in paranthesis it will be a message to the user
		
	//	System.out.println("dead code");//  this is a dead code because program will get terminated at the line 10 so this line is of no use so it is called as dead code
		
		
		
		
		
		
	}
	
	
}
//what is difference between throw and throws
// throw--> it is used the throw the exception and it is define inside the method
//throws---> it is used to handle the compile time error related to exception and is define beside the method name

// throw keyword is used in paytm sometimes itshows try again message it something goes wrong  

