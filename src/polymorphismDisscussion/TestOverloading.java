package polymorphismDisscussion;

public class TestOverloading {
	
	
//METHOD OVERLOADING DISSCUSSION
	
	
	public static void m1(int i)// name + argument=signature[m1+int i], m1= method name, 
	{
		System.out.println("method with one argument");
	}
	
	public static void m1()
	{
		System.out.println("method with zero arguments");
	}

//method overlaoding = methods having same name but different signature is called method overloading IRRESPECTIVE OF WHETHER THE METHOD ARE STATIC OR NONSTATIC AND WITH RETURN OR WITHOUT RETURN
// m1(int i), m1(int i, int j, boolean k) is the overloaded method of m1
// 2 same methods with exact arguments but the sequence of arguments are different then also it the case of method overloading

public void m1(int i, int j, boolean k)
{
	System.out.println("methods with three arguments");
}


//public static void m1(int j) // error because two method with same name and same arguments,same data type will be considered as duplicate
//{
//	System.out.println("method with ine arguments");
//}

public  void nameChange(String nameofperson, int documentCategory)
{
	
}

public  void nameChange(String nameofperson,int documentCategory, String MarriageCerNumber)
{
	
}


public static void main(String[] args) {
	
	TestOverloading t= new TestOverloading();
	t.nameChange("yogita", 29, "494944t");// HERE WHEN USER AT FRIST USES THE TWO ARGUMENT IT WILL SELECT (Public static void nameChange(String nameofperson,int documentCategory, )
	                                 // BUT WHEN THE USER SELECT THE 3 ARGUMENTS IT WILL SELECT nameChange(String nameofperson,int documentCategory, String MarriageCerNumber) THIS METHOD AUTOMATICALLY
		
	
}

//IN METHOD OVERLOADING 









}











