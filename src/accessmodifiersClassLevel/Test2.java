package accessmodifiersClassLevel;

public class Test2 {
	
	
	public static void main(String[] args) {
		   
		Public t = new Public();
		Public.m1(); // when there is "public" keyword for the existing class so the class itself along with the method variable are accessible in other class
		
	Default t3 =new Default();
	t3.m2(); // default class method is accessible in the same package
	
	
	// calling the default variable from variableaccessmodifier class
	
	variableaccessmodifier vv = new variableaccessmodifier();
			System.out.println(vv.b); //<default> variable from method accessmodifier class
	
			// calling the PROTECTED variable from variableaccessmodifier class
			
			System.out.println(vv.x);// protected variable called inthe same package but different class it is possible through refrence variable of the parent class
	}
	

}
