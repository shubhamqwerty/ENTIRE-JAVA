package casting;// CASTING WRT  DATA TYPE

// casting is used change the data type
// the process to convert an entity(variables) into another type is called casting.(i.e. words can be converted into words and same is for number)

public class Test {
	
	
	public static void main(String[] args) {
		
		int i =10; 
		
	byte	b=(byte)i;
		
		// there are 2 types of casting
	
// 1.  IMPLICIT CASTING ---> CONVERTING A SMALL DATA TYPE INTO BIGGER DATA TYPE..
	
	   byte c = 45 ;
	   
	   int  f =(int)c; //here byte(2 byte) which is a small data type (in terms of size) is converted into large data type int(4 byte)
	                  
	   
	   System.out.println(f);
			   
//NOTE --> IN IMPLICIT CASTING THERE NO CHANCE OF DATA LOST		   
// here widening of data type takes place i.e. we are widening the scope of daata type take place
	
	char ch = 'a';
	
	int e = (int)ch;//  //in java character is saved as UNICODE AND WHEN WE TRY CHANGE THE DATA IF CHARACTER INTO DATA TYPE THEN IT WILL RETURN THE UNICODE
	
	System.out.println(e);//97
	
// Explicit casting --> HERE WE ARE CONVERTING HIGHER DATA TYPE VALUE INTO LOWER DATA TYPE
	
	int j = 130;
	
	byte k=(byte)j; // here max value of byte is 127(range -128 to 127) if out of range it will reset(i.e it move to zer from least  value
	
	System.out.println(k);
	
// NOTE -> HERE DATA IS LOST
//	here narrowing of data type takes place i.e. we are reducing the scope of data type
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
