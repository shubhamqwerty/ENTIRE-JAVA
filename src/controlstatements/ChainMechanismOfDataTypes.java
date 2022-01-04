package controlstatements;

public class ChainMechanismOfDataTypes {

//  byte-->short-->int-->long-->float-->double	 here chain flows to right side so in output we have to mention largest datatype         
//  char 	
	
	
	public static void main(String[] args) {
		 
		byte a=12;
		byte b=24;
		
		byte c= a+b; //error because addition of two byte 2 short or addition of byte and short is int 
                      //and addition of two int is int
		
		 //byte + byte= int
		//byte +short = int
		//char + byte= int
		//int + long = long
		//int + float = float
		// int + double = double
		//char + char =iny
		// float + float= float
		//double +double = double
		//long + float= float 
		// float +double= double 
		
		
	}
	
	
	
}
