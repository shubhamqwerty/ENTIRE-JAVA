package interfacedicussion;
// INTERFACE3 WILL HAVE TO GIVE TJE IMPLEMENTATION MENTIONED IN INTERFACE1 AND INTERFACE 2 SINCE BOTH ARE EXTENDED I  INTERFce3
public class Test2 implements Interface3 {

	@Override
	public void rule1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {// IS IMPLEMETED ONLY ONCE THOUGH REPEATED
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m70() { //IMPLEMENTED ONLY ONCE THOUGH REPEATED 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m100() {
		// TODO Auto-generated method stub
		System.out.println("m100 is running");
	}

	
	 
	public static void main(String[] args) {
		
		Test2 t2=new Test2();
		t2.m100();
		
		//  Interface3 i3 = new Interface3(); // error bacause we cant create the object of interface 
		
		
		Interface3 i4 = new Test2(); // interface ref variable and test2 object(parent ref and child object)
		i4.m4();                            //  here methods of Test2 will be called since all the methods are overrided
		
		Interface2.m2(); //calling a static method
		
		
	}
	
	
	
	
	
	
	
}
