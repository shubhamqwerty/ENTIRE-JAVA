package controlstatements;

public class SwtichCaseStatement {
	
	
	public static void main(String[] args) {
		
		
		int  i =500 ;
		
		switch (i)
		{
		// here i value is 50 and the case whose value is 50 will get excecuted and all cases below it will also get executed
		// so to execute the particular case which matches  i value we use break keyword
		
		case 5 : System.out.println("Case having 5 value is running");
		          break;
		
		case 50 : System.out.println("Case having 50 value is running");
		          break;
		 
		case 10 : System.out.println("Case having 10 value is running");
		          break;
		 
		default: System.out.println("nothing got matched hence default is running");
		
		
	// default should be placed at the bottom beacause if default is executec then the cases below it will not be executed	
	// default case is optional	
		
		
		String s ="abc";
		
		switch (s)
		{
		case "abc": System.out.println("case having abc");
		break;
		
		case "hgf" : System.out.println("case hgf");
		
		
		
		
		
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
