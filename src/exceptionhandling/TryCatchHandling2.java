package exceptionhandling;// file not found exception

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchHandling2 {
	
	
	
	public static void main(String[] args)  throws FileNotFoundException  {
		
		String path;
		try //f path get wrong it go to catch if ri8 then will execute thr try
		{
		    path ="E:\\MY JOB\\automation testing\\Interface.docx"; // default value of string is 	NULL and if we compare any String with null then at that time it shows NULL POINTER EXCEPTION
		                                                                 // IN JAVA WE WRITE PATH IN DOUBLE FORWARD SLASH
		    
		    FileInputStream fis  = new FileInputStream(path);//path will give the address in paranthesis
		    
		    // FILEINPUTSTREAM IS a class in java (predefine) jiske andar agar hme file ko handle krna hota hai(means to perform any operation on that file and we also have to reach that file there we give the path also) in that case we use fileinputstream
		// fileinputstream validate whether the file is there on that particular location(path) or not
	
		    
		    System.out.println(path);
		}
		
		catch(FileNotFoundException e)
		{
			
			 path ="E:\\MY JOB\\automation testing";
			 
			 System.out.println("defalt path is"+ path);
			
		}
				

		
	// this is FILENOTFOUNDEXCEPTION it will ocuur when the file is not in that particular location	then we can bypass that risky code and enter into the catch block giving the alternate path which should be accurate for normal termination
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
