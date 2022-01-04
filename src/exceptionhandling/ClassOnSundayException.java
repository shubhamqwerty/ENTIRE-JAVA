package exceptionhandling;
//here we are making exception of our own
public class ClassOnSundayException extends RuntimeException{
	
	public ClassOnSundayException(String s) // this is the exception created
	{
		super(s);
	}

}
