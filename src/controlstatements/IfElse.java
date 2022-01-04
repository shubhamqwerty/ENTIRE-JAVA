package controlstatements;

public class IfElse {
	
	public static void main(String[] args) {
		
		// SYNTAX OF IF ELSE
		
				// if(boolean conditon)
			//	{
					//ACTION
			//	}
			// else
			//	{
					//ACTION
			//	}
				
				// IF ELSE THEORY--- if in bracket of if we mention true it checks the conditon in curly braces of IF if the condition are true then only the IF wala bracket runs otherwise it is not executed
				                    //and if ELSE is menton along with IF then when condition of IF gets wrong then ELSE  loop get executed
				
				
			if(true) // here true is written so if loop is executed
			{
				System.out.println("if is running");
			}
			else
			{
				System.out.println("else is running");
			}
			
			System.out.println("**************");
			
			if(false) // here false is written so else loop is executed
			{
				System.out.println("if is running");
			}
			else
			{
				System.out.println("else is running");
			}
		// CHECKING MULTIPLE CONDITION
			int a=10;
			int b=20;
			
			if(a==5)	//if false not executed move to next line
			{
				System.out.println("a value is 5");//not e
			}
			else if(a<5) // IF FALSE PROGRAM WILL NOT ENTER INTO CURLY BRACES FIRST CONDITION ARE CHECKED IF TRUE IT WILL ENTER BRAKET IF FALSE IT WIL NOT
			{
				System.out.println("a valueis less than 5");
			}
			else if(a>5)// true--- program will stop/TERMINNATE. SINCE CONDITION SATISFIED
			{
			System.out.println("a value is grater than 5");	
			}
			else
			{
				System.out.println("No condition apply");
			}
			
	//LOGICAL OPERATOR
			
			int ab=50;
			int cd=100;
			 
			//logical AND &&
			
			if(ab>10 && cd>150); //here if both condition are satisfied then only if block will be executed otherwise it will not
			{
				System.out.println("if is runnnig");
			}
			else
		    {
				System.out.println("else block is running");
			}
			
			
			
			
	}

}
