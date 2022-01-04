package controlstatements;

public class IncrementAndDecrement {
	
public static void main(String[] args) {
	
	int y;
	int x=10;
	
	y=x++; //execute+assign
	
	System.out.println("y post increment"+y);//10
	System.out.println("x post increment"+x);//11
	
	y=--x;// here udated value of x  will be stored i.e 11 
	
	System.out.println("y predecrement"+y);//10
	System.out.println("x predecrement"+x);//10
	
	char c='a';
	c++;//c=c+1 
	System.out.println(c);//
	
	//to print "asc" valUe of any character
	
	int p='R';
	System.out.println(p);//here asc value of R will be printed
	 
	
	
	
}
	
	  

}
