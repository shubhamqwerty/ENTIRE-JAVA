package constructordiscussion;

public class ConstructorBasics  {//class name
	
	//  rule 1---class name and constructor name should be same
	//rule 2--- constuctor should be of non static type
	// rule 3-----constructor can takr argument 
	//rue 4 constructor should be of non return type
	//WE CAN HAVE MULTIPLE CONSTRUCTOR IN CLASS MAY BE OF SAME ARGUMENTS 
	int i;
	int j;
	
	public ConstructorBasics () // this is user define constructor // when there is no constructor JVM will execute default constructor
	{this(2);
	System.out.println("this is zero argument constructor");
	
	
	}
	
	
	public ConstructorBasics(int e)
	{this(34,65);
		System.out.println("this is 1 argument constructor");
	}
	
	
	public ConstructorBasics(int e, int h)
	{this(true,235,"SRAFgsfd");
		System.out.println("this is 2 argument constructor");
	}
	
	public ConstructorBasics(boolean e, int h , String s)
	{
		System.out.println("this is 3 argument constructor");
		
		System.out.println("$$#%@#%%5");
	}
	
	
	//TO CALL ONE CONSTRUCTOE INTO OTHER
	// Rules 1-----WE CAN CALL ONLY 1 CONSTRUCTOR INTO ANOTHER 
	//Rules 2 ----- WHEN WE CALL ONE CONSTRUCTOR INTO ANOTHER THEN THE CONSTRUCTOR WHICH WE R CALLING SHOULD ON FIRST LINE
	
	
	
	
	
	
	public ConstructorBasics(boolean e, int h , boolean s)
	{    this(true,24235.3535); ///TO CALL ONR CONSTRUCTOR INTO OTHER WE USE this  KEYWORD
		System.out.println("e ,h , s");
	}
	
	public ConstructorBasics(boolean e, double u)
	{this();
	this(23,56); //ERROR BECAUSE we cant call two constructor  in one constructor
		System.out.println("e , u ");
	}
	
	 
	// USE OF "THIS" KEYWORD
	//1. TO Call a constructor
	//2. to call a non static variable
	//this();--> used to call a constructor
	//this---> used to call a non static variable
	
	
	// NOTE--->>" we can call all contructor though one object provided we to call every constructor in one other"
	
	
	
	public static void main(String[] args) { 
		
		
		ConstructorBasics cb = new ConstructorBasics(); //this line will execute ConsturctorBasic method
		
		System.out.println("************************************");
		
		System.out.println(cb.i); // i=0 default value 
		System.out.println("************************************");
		
		ConstructorBasics cb1 = new ConstructorBasics(); // constructor will run every time when we create N number of objects 
		
		System.out.println("************************************");
		
		ConstructorBasics cb2 = new ConstructorBasics(25);// this object wiill detect constructor with one argument //when we put value in () we assign values to the variable 

		System.out.println("************************************");
		
		ConstructorBasics cb3 = new ConstructorBasics(25,49 ); //this object wiill detect constructor with 2 argument

		System.out.println("************************************");
		
		ConstructorBasics cb4 = new ConstructorBasics(true,49 ,"gjhgkmgfu");
	
		System.out.println("************************************");
		
		ConstructorBasics cb5= new ConstructorBasics(true, 24,false);
		
		System.out.println("************************************");
		
		ConstructorBasics cb6= new ConstructorBasics(true, 2465.668);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
