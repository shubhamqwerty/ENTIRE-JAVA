package varaiblediscussion;

public class College2 {
	
	static String collegename = "velocity";
	
	static String year ="1st year";
			
			int m1marks ;
			
			int physicsmarks;
			
			
			public void m1(int m1, int phy)
			{
				m1marks =m1;
				physicsmarks = phy;
				
			}	
			
			
			
		     public static void main(String[] args)
			{
				College2 stu1 = new College2();
				
				stu1.m1(28, 49);
				
				College2 stu2 = new College2();
				stu2.m1(39, 93);
				
				System.out.println(stu2.physicsmarks);
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
