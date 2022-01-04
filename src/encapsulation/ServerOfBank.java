package encapsulation;

public class ServerOfBank {
	// THIS WHOLE IS DATA BINDING
	
	 private int cust1bal=50000; // private beacause it should not be visible in other class  directly i.e hiding the data
	
	
	
	public int getBalance(int pin)
	{
		if(pin==1234)
		{
			System.out.println("Balance is :"+ cust1bal); //USING THE PRIVATE VARIABLE(custbal) IN THE public  method  this is data hiding
		}
		else
		{
			System.out.println("authentication fail please contact your bank");
		}
		
		return cust1bal;
	}

	
	public void setBalance(int withdrawlamount )
	{
	    cust1bal = cust1bal - withdrawlamount;	
	}
	
	public void withdrawl(int withdrawlamount)
	{
		setBalance(withdrawlamount);
		
		System.out.println("Amount Rs. "+withdrawlamount+" has been successfully withdrawn, Please collect your Cash");
	}
	
	
	
	
	
	
}

//ENCAPSULATION=DATA HIDING + ABSTRACTION  THE PROCESS OF BINDING THE DATA AND CORRESPONDING METHOD INTO A SINGLE UNIT IS CALLED ENCAPSULATION 
//PRIVATE VARIABLE WHEN ACCESSED INTO THE PUBLIC METHOD CALLED AS DATA HIDING
//ABSTRACTION = HERE ONLY THE FUNCTIONALITY/services IS VISIBLE AND NOT THE ACTUAL LOGIC/ METHOD USED IN IT
//data hiding= OUTSIDE PERSON CANNOT ACCESS THE DATA DIRECTLY WE HAVE TO ACCESS IT IN THE INDIRECT WAY i.e THE DATA SHOULD NOT BE ACCESSIBLE FROM ANOTHER CLASS IT HAS TO BE DONE THROUGH INDIRECT WAY IS CALLED DATA HIDING
// IT CAN BE ACHIVED BY MAKING THE VARIABLE AS PRIVATE AND WE USE THAT VARIABLE INSIDE PUBLIC METHOD
//ABSTRACTION= HIDING OF INTERNAL IMPLEMENTATION AND JUST HIGHLIGHT THE SET OF SERVICES THAT WE ARE OFFERING IS CALLED ABSTRACTION

// GETTER METHOD = THE METHOD WHOSE NAME STARTS WITH GET AND THAT METHOD ONLY BRINGS/FETECHES THE DATA(i.e brings information) IS CALLED GETTER METHOD
// SETTER METHOD = THE METHOD WHOSE NAME STARTS WITH SET AND THEOUGH THIS METHOD THE INFORMATION GETS UPDATED