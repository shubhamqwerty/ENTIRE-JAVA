package accessmodifierMethodLevel;

public class TestClass {

	
	public static void main(String[] args) {
		
		
		MethodAccessModifier.m1();
		
		MethodAccessModifier mam = new MethodAccessModifier();
		mam.m2();  // default method is accessible in the same package
		mam.m4(); //protected method is accessible in the same package
		
	}
	
	
	
	
	
	
	
}
