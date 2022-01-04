package inheritancediscussion;

public class Child2 extends Parent {

	public static void main(String[] args) {
		
		Child2 c2 = new Child2();
		c2.car();
		c2.home();
		c2.property();
		
		c2.bike; // is not accesible because child2 does not have access of child 
	            	// to call we have call by creating the object of child class which is general method to call nonstatic  method
		 farm();// valid beacause child2 extends parent and parent extends GrandParents this is called multilevel inheritance

	// MULTILEVEL INHERITANCE--- INHERITANCE MORE THAN ONE LEVEL CALLED AS MULTI LEVEL INHERITANCE
		 
		 // TOP MOST SUPER CLASS(GRANDPARENTS) WILL BE AVAILBBLE TO SUB CLASS(PARENT,CHILD,CHILD2)
		 
// MULTILEVEL INHERITANCE IS POSSSIBLE BUL MULTIPLE INHERITANCE IS NOT POSSIBLE
		 // MULTIPLE INHERITANCE---> IF WE TRY TO CREATE MORE THAN ONE PARENT OF ANY  CHILD THEN IT IS MULTIPLE INHERUTANCE WHICH IS NOT POSSIBLE
	
// MULTILEVEL INHERITANCE IS POSSIBLE  BECAUSE  ----- >EVERY CLASS HAS ONLY ONE PARENT CLASS
	
	// MULTIPLE INHERITANCE IS NOT POSSIBLE BECAUSE---> SINGLE CLASS CANNOT HAVE TWO DIFFERNT PARENT CLASS
	
	
	
	}
	
	
	
	
}
