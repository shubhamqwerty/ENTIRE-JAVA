package methodsdiscussion;

public class WithReturnWithArgumants {

	
	public int multiplication(int a, int d) {
		
		int c = a*d;
		  
		return c;
		
		}
	
	public static int division(int y) {
		
		
		WithReturnWithArgumants refvar= new WithReturnWithArgumants();
		
		int p = refvar.multiplication(20 ,10);
		
		int z = p/y;
		
		return z;
		
	}
	 
	
	public static void main(String[] args) {
		
		double g = division(20);
		
		System.out.println(g);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
