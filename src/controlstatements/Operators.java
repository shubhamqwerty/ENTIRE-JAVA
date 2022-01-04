package controlstatements;

public class Operators {
	
	public static void main(String[] args) {
		
	// 1.ARITHMtic operator
		
		//   + ---> addition if it is used between 2 numeric operator
		//   + ---> concatination operator if it is used between a string value with any other data type and the resultant type would be string
		
	int a = 10;
	int b= 20;
	System.out.println(a+b);//30
	
	String s ="1";
	
	int c=29;
	System.out.println(s+c);//129 // jaha se string chalu waha se concatination takes place
	System.out.println(s+c+a+b);//1291020 // this is expression it get evaluated from left to right//here string is 1st so concatination takes place
	System.out.println(a+b+s+c);//30129  //b4 string addition and after string concatination
	System.out.println(a+b+c+s);//591    // here addition then concatination
	
	 //  '-' subtraction 
	//   '*' multiplicatiion 
   //    '/' division 
  //     '%'  modulus -- through this operator we can get the value of remainder
		
		int d=100;
		int f=33;
		
		int g =d%f;
		System.out.println(g);
		
		
	//2.COMPARATOR OPERATOR
		
		//a.<-- less than operator
	   //b.>-- greater than operator
      //c.= -- equal to operator
		
		int m=30;
		int n=20;
		
		boolean o=m<n ;  //true 
		
		System.out.println("o value is :"+ o);
		
		System.out.println("***********");
		
		
		boolean p=m>n;   //false..  ::
		
		System.out.println("p value is :"+ p);
		
		
		if(o) // o is boolean i.e true  here if block will be executed// if o value is false i.e. (m>n) then else block will be executed
		{
			System.out.println("m is less than n");
		}
		else
		{
			System.out.println("m is greater than n");
		}
		
		
		
		if(m<n) // we can directly assign condition
		{
			System.out.println("if is running");
		}
		else
		{
			System.out.println("else is runnig");
		}
		
		
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
				
			// greater than >

			boolean q = m>n;// true


			// less than or equal to <=

		boolean	r = n<=m;// true

		// greater than or equal to >=

		boolean	t = m>=n;// true

		//== equal operator, =

		boolean u = m==n;

		System.out.println(u);

		//3. logical operator
		
		// a. AND &&
		//B.OR (||)
		//C. NOT(!)
		
		
		int ab = 50;
		int cd = 100;
		
		// logical AND
		
	if(ab>10 && cd>150 )	// in paranthesis of IF final condition(i.e both condition) is true then only if block will run
	{
		System.out.println("if is running");
	}
	else
	{
		System.out.println("else is running");
	}

		//WAP to check the range of number - 0-20, 21-40, 41-60, 61-80, 81-100

	//logical OR

		if(ab==100 || cd>50)// here in OR if one of the condition is true then the block is executed
		{
			System.out.println("If condition");
		}
		else
		{
			System.out.println("else condition");
		}	
	
		
	//LOGICAL NOT !
		
		int v=50;
		int w=50;
		
		 boolean x =v!=w; //false (!= ---- meaning is not equal to)

		System.out.println(x);
		
		if(!(v==w)) //  meaning v is not equal to w since NOT is mentioned so block represents false condition
		{
			System.out.println("if block");
		}
		else
		{
			System.out.println("else block");
		}
		
		if(!(!(v==w))) //  2 NOT leads to TRUE CONDITION
		{
			System.out.println("if block");
		}
		else
		{
			System.out.println("else block");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
