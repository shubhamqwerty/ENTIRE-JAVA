package accessmodifiersClassLevel;

public class VaraibleAccessmodifier2 {

    public	static final int a=50; // by using FINAL keyword we cannot change the value of a
	
      final int b=60;	



public static void main(String[] args) {
		
//a. static variable
		//a=a+2 //error because when we declare the variable as FINAL  we cannot reassign the new value to that  static variable
		System.out.println(a+12); // THIS IS VALID BEACAUSE IT THE OPERATION PERFORMED ON VARIABLE
		
//. non static variable		
VaraibleAccessmodifier2 vam2 = new VaraibleAccessmodifier2();
		
		System.out.println(vam2.b);
		
    vam2.b=vam2.b +2;// we cannot reassign the new value to the non static variable which is declaared as nonstatic

//c.local variable
    
    final int h =50;
   
    h=h+2; // wecannot reassign the new value to the final variable

	}
	
}

//NOTE--/-> WE CANNOT REASSIGN THE NEW VALUE TO THE VARIABLE WHICH IS DECLARE AS FINAL IRESPECTIVE OF VARIABLE WHETHER THEY ARE STATIC,NON-STATIC,LOCAL
//---> abstract cannot be used with variable abstract can only be used with variable and method(non stATIC)