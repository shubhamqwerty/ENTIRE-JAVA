package abstractdicussion;

public abstract class Test2 extends Test {
// here we know the implementation of m4 and m5 methods (so implemented) and not of m6 in such cases we will have to define the child class of Test2 (declare Test2 as abstract) and in that child class we will have to define m6 method  
	//reason why we declare Test2 as ABSTRACT because we still dont know the implementation all the methods(i.e. m6) at this stage. unless we dont know the implementation of all the method that many times error will occur and that error will reminds us that we have missed certain funtionality due to abstract we will not miss any functionality
	// har rk abstract class ki child class banani padegi aur uss child class ki reponsibility hogi k jitne ne bhi incomplete method hai un sab ke implementation provide karaye agar child class sabhi methods ka implementation nhi kara sakti toh usko ABSTRACT DECLARE KAR DENA CHAHIYE AUR USKI CHILD CLASS BANANI PADEGI JISME BACHE HUE METHODS K IMPLEMENTATIONS PROVIDE KRE
	
	public void m4() {
		
		System.out.println("M4 FROM TEST2 CLASS");
	}

	
	public void m5() {
		
		System.out.println("m5 from test2 class");
}
	
	public static void main(String[] args) {
		
		Test3 t=new Test3(); // here we can create object of the class and can call the methods because the class is not the abstract that means implementation of all the incomplete methods are done
		t.m1();             // same object will call the constructor of parent class (i.e test)
		t.m2();
		t.m3();
	}

	
}
// when the method is incomplete we compulsarily have to declaare the class as abstract if not class will show error

// WE CANNOT HAVE STATIC METHOD AS ABSTRACT IT WILL THROW AN ERROR BUT WE CAN HAVE A COMPLETE STATIC METHOD INSIDE IT