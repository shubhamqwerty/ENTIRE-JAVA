package accessmodifiersClassLevel;

 class Default {
	
	//DISSCUSSION OF DEFAULT ACCESS MODIFIER
	
	//TO MAKE A CLASS "default" REMOVE THE WORD "public" FROM THE CLASS
	//  WHEN THE CLASS IS DECLARE AS DEFAULT CLASS IT IS ONLY ACCESSIBLE INSIDE THE PACKAGE AND NOT OUTSIDE THE PACKAGE
	 // when we have to access the class inside the same package and we dont have to make its child class at such times we use syntax like----> " class final classname" 
	public void m2()
	{
		System.out.println("M2  METHOD FROM TEST3 CLASS");
	}
	
	
	public static void main(String[] args) {
		
		Default t3 = new Default();
		t3.m2();
		
		Parent.marry(); // ACCESSSING THE PARENT CLASS(WHICH IS DECLARED AS FINAL i.e.cannot make  child class of of final class but can be accessible everywhere) METHOD
		Parent pp= new Parent (); // ACCESSSING THE PARENT CLASS(WHICH IS DECLARED AS FINAL i.e.cannot make  child class of of final class but can be accessible everywhere) METHOD
		pp.car();// ACCESSSING THE PARENT CLASS(WHICH IS DECLARED AS FINAL i.e.cannot make  child class of of final class but can be accessible everywhere) METHOD 
		
		
	}
	
	
	
	
	
	
	
	
	

}
