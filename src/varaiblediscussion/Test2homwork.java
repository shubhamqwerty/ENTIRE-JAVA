package varaiblediscussion;

import interfacedicussion.Interface1;

// output of 1 method will be input for other

public class Test2homwork {
	 public static int m1(int i, int j) //here we did not take non return type because m1 is going to be input for m2
	 {
		i=i+5;
		j=j+3;
		
		System.out.println("i value is :"+i);
		System.out.println("j value is :"+j);
		 
		 return j;//return j means m1 will only return value of j and not i
	 }

	 
	 public static void m2 (int k)
	 {
		 System.out.println(k);
	 }
	 
	public static void main(String[] args) {
		   int l= m1(40,79);//  j will be 82 and j=82 will be stored in l, l will print value of j since in return m1 gives only j
		   
		 m2(l);// output of m1(l) is input for m2
		 
		 
		 System.out.println(Interface1.j);///variable from interface1 is accessible though declared as final that is variable declard as final are public not like methods when declared final is accessible in that class only and also not like when class declared as final we cannot make the child class of it
		 
	} 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
