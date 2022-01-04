package constructordiscussion;
//same project with the help of constructor
public class College {
	
int m1marks;
int phymarks;

public College(int m1 , int phy)
{
	m1marks =m1;
	phymarks=phy;
	
	
	}

//OR......

//  public College(int m1marks , int phymarks)
{
//	this.m1marks =m1marks;
//	this.phymarks=phymarks;
//calling with the help of THIS because names are same	
	
	}
	
	public static void main(String[] args) {
		
		College stu1 = new College (39,38);
		
		College stu2 = new College (64,34);
		
		System.out.println(stu1.phymarks);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
