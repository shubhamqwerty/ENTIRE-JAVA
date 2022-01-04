package polymorphismDisscussion;

public class Test2Overloading extends TestOverloading {
	
	public static void m1(boolean b)
	{
		System.out.println("m1 method with boolean argument"); // here test2 is child of Test class and Test2 has same method name (m1) with different signature as compared to [m1(int i, int j, boolean k),m1(),m1(int i)] of Test
	}                                                         //so it is the case of method overloading since test2 extends test

	// 2 same methods with exact arguments but the sequence of arguments are different then also it the case of method overloading

	public int m1(int i , boolean b)
	{
		return 50;
	}
	
	public void m1(boolean b , int i)
	{
		
	}
	
	public static void main(String[] args) {
		
		Test2Overloading t2=new Test2Overloading();// on the basis of t2 we can call any method from Test and Test2
		
		t2.m1(false, 0);
		m1();// from parent class
		
		
		TestOverloading t= new TestOverloading();// through t we can only access methods from parent class (i.e. test class)
		t.m1(33,23, false);
		
		
		TestOverloading t1 = new Test2Overloading();
		t1.m1(45, 76, false);
		t1.m1(false,54); // cannot call child class methods
		//INTERVEW QUESTION//IMP NOTE---> PARENT REFRENCE VARIABLE(Test t1) can be used to hold child object(Test 2) but cannot call the child class methods i.e. through t1 we can only parent class methods and not the child class methods
		// hold the child class ---> it means parent canonly refer the child class but parent class will not have the access of child class 
		// after "new" whatever we type is nothing but the OBJECT
		
// what does refer child class means
		// ans- it has 2 scenario
		//1st-overloading OR methods with different name---> parent refrence variable can only access parent class
	//2nd- method name and signature are same(overriding)---->here parent ref variable can only access the child class
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
