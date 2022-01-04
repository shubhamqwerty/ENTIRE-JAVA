package methodsdiscussion;

import interfacedicussion.Interface1;

// program to print only area
public class Test implements Interface1 {

	public void area(int length, int breadth)
	{
		int area = length * breadth;
		
		System.out.println("area is ="+ area);
	}
	
	
	
// program to add area of two lands
	
	public  int area2(int length,int breadth)
	{
		int area = length*breadth;
		
		System.out.println("the area is  : " +area);
		
		return area;//Note- return is used when we have to use the return value for future use by storing it into a varaible
	}
	
public static void main(String[] args) {
		
		Test x=new Test();
		
		x.area(45,45);
		
		System.out.println("***********************************");
		
		 int land1 = x.area2(54, 12);
		 
		 int land2 = x.area2(23, 32);
		 
		int j = land1+land2;
		 
		 System.out.println(j);
		 
		
		
		
	}



@Override
public void rule1() {
	// TODO Auto-generated method stub
	
}



@Override
public void m1() {
	// TODO Auto-generated method stub
	
}



@Override
public void m3() {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	
}
