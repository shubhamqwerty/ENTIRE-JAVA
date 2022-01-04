package accessmodifiersClassLevel;

public class variableaccessmodifier {

	// a.public access modifier
	
	public int a= 20; //this is accessible through out the project
	
	public void m1()
	{
		public int a= 20; // here error because public itself means to be accessible anywhere in the project but now it is only for a particular method 
                          // this is like method level variable
	}
	
	
	//b. <default> access modofier
	
	int b=10; // nothing is written b4 int so it is calles as default
	         // default variable is only accessible inside the package and not outside the package
	// calling the variable in the test2 class which is inside the package and in accesstest class which is outside the package
	
	
	
	// c. private access modifier
	
	private String s= "I WILL DEFINATELY GET MY JOB"; // private access modifier is accessible only inside the class
	
	
	// d. protected access modifier
protected String x= "jai shree mataji  "; //it is  protected nonstatic variable
	
	public void protect()
	{
		System.out.println(x); // nonstatic variable can be directly called into nonstatic method
	}
	
	
	
	

public static void main(String[] args) {
	variableaccessmodifier xx= new variableaccessmodifier();
	System.out.println(xx.s); //  s is private is accessible only inside the class
	
	
	
	
	
	
	
	
	
}








}
