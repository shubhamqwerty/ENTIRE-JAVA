package varaiblediscussion;

public class StaticAndNonStatic {

	static int i=50;
	
int j=20;

int k;


	
	public static void main(String[] args) {
		
		i=40;// here value of static variable i value has changed to 40
		 
		StaticAndNonStatic a = new StaticAndNonStatic();
		
		System.out.println("j value is : "+ a.j);//20
		
	a.j=30;   //here value of varaiable j is changed to 30
	
	System.out.println("updated value of j is : "+ a.j);
	
	System.out.println("**********");
	
	StaticAndNonStatic b = new StaticAndNonStatic();
	
	System.out.println("b value is :"+ b.j);//20
	b.j=25;
	System.out.println("updated j value in b : "+ b.j);//25
	//acceessing static varaible by forming object... but this not prefered
	
	System.out.println("i value from a is :" + a.i);//40
	
		a.i=30; // here value of i is changed from 40 to 30 //here we changed the value of i in object a
		
	System.out.println("updated i value from b is:"+ b.i);//30	//we have changed the value of varaible i in object a but when we print it through object b it also get updated in object b when changed in object a 
	
	System.out.println(a.k);//0  // here k value is not define therefore jvm automatically assign it value as 0

	}
}
