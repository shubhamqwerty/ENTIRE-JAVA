package interfacedicussion;
//RULE 1-- SINGLE CLASS CAN  IMPLEMENT MULTIPPLE INTERFACES AT SAME TIME i.e. IN INTERFACE FOLLOW MULTIPLE INHERITANCE
//RULE 2---single class can extends one class at a time and can implement N number of INTERFACE (CONDITION -->THAT extends HAS TO BE WRITTEN BEFORE implement)
// RULE 3 ----AN INTERFACE CAN EXRENDS ANOTHER INTERFACE BUT A CLASS HAVE TO CONNECT WITH ANITHER THROUGH IMPLEMENT

public class ImpleClass1 extends Test implements Interface1, Interface2 // single class can extends one class at a time and can implement N number of interfacess at a time
{

	public void rule1()
	{
		
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println(Interface1.j); // accessing the variable of same name in different interfaces
		
		System.out.println(Interface2.j);
	}

	@Override
	public void m5() {
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

	@Override
	public void m70() {// this is the repeated method in both the interface but while implementing it is implemented only once because logic will be same for both so implemented only once
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	
	//to call the static meyhod from interface1 and interface2
	
	Interface1.m2();//calls interface2 m2 method
	
	Interface2.m2();// calls the interface2 m2 method
	
	
	
}


                             // VARIABLE IN CLASS

 static int j =56; // whenever the variable is  static it wilL be represented in ITALIC

  String s = "JAI SHREE MATAJI"; // HERE 's' is nonstatic it will not be in italic it is normal

//	NOTE --> WE Can also identify the variable whether the variable is static or non static by looking to the format when ITALIC=static variable NORMAL= NON-STATIC VARIABLE

















}
// NOTE---> MULTIPLE INHERITANCE IS POSSIBLE IN INTERFACE BUT IT IS NOT POSSIBLE WITH RESPECT TO CLASSES.

//why multiple inheritance is possible in inheritance REASON ->   IN INTERFACE THERE ARE INCOMPLETE METHODS INTERFACES CAN HAVE 2 METHODS OF SAME NAME WHICH DOES NOT HAVE THE BODY THAT MEANS IT DOES HAVE THE LOGICS BUT  IN THE CASE OF CLASS TWO METHODS OF SAME NAME CAN HAVE THE SAME LOGICS WHICH IS THE CASE OF DUPLICATE WHICH IS INVALID

// IN CLASSES CASE  METHODS HAVE THE BODY AND THE LOGIC DEFINE INTO IT(we cannot define the method without the body in classes) if there are 2 methods having same name and when child extends the both the classes (which has 2 methods of same name) when it calls the method child  class will be confused which method to call and from which class so CLASSES does not follow inheritance

//IN INTERFACE CASE METHODS DOES NOT HAVE THE BODY(i.e we can define methods without body) if we have 2 interfaces and define same methods(without body) in both it dont show any error beacause(there is no relation between 2 interfaces both act independently as different different method)  interface does not define the body(logic) .  Child class defines the body and will implement the method only once because we are not aware of the logics to be defined into it  

// THE  METHOD WHICH  ARE REPEATED IN INTERFACES  ARE IMPLEMEMTED ONLY ONCE