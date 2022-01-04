package loopsinjava;

public class ReverseANumber {

	
	
	public static void main(String[] args) {
		
		
		int number = 254355487 ;
		
		int remainder;
		
		int reverse =0;
		
		while(number>0)
		{
			remainder= number%10;
			 
			reverse = (reverse*10) + remainder;
			number= number/10;// here it will be 1234.5 but int will neglect .5 since datat type is int 
			
		}
		System.out.println(reverse);
 		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
