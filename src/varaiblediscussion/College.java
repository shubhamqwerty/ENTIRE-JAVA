package varaiblediscussion;

public class College {

	static String college="Velocity";//name of college will be same so we use static variable
	
	static String year= "1st year";// we have noyr marks of only 1st year so we used static variable
	
	int m1marks;// here marks will change for every student so we use non static variable
	
	int physicsmarks;// same for physics
	
	public static void main(String[] args) {
		
		College stu1 = new College();// with the help of this marks of stu1 will be stored in stu1
		stu1.m1marks=30;
		stu1.physicsmarks=50;
		
		College stu2 = new College();// same for stu2
		stu2.m1marks=45;
		stu2.physicsmarks=21; 
		
		System.out.println(stu1.m1marks);
		
	}
}
