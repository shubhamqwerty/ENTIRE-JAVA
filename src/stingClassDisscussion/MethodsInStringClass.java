package stingClassDisscussion;

public class MethodsInStringClass {
	
	public static void main(String[] args) {
		
		// 1. equals : content comparator

		
		String s= "abc";
		String ss="abC";
		
		
	boolean isequal	=s.equals(ss);
	System.out.println(isequal); // false
		
		
		// 2. equalsIgnoreCase(String): Content Comparator without letter case
		// this method will only chech the letter without considering they are upper case or lower case
	
	boolean isequalwithoutcase= s.equalsIgnoreCase(ss);	
	
	System.out.println(isequalwithoutcase);// true
	
	
	    //3. contains(char sequence):
	//this method will check that whether particular string has letters mentioned and it will check in the sequence we mentioned
	
	String ss1= "abcdefghi";
	 boolean ispresent = ss1.contains("efg"); // efg this sequence will be checked in ss1
	 
	 System.out.println(ispresent);
	 
	 
	 // 4. charAt(int index)
	 // this method will search the particular index value of character in the string
	 
	 String ss2 ="fjjfsdkjgf b";
	 
	 char value = ss2 .charAt(3);
	 
	 System.out.println(value);
	 
	 
	 // 5.concat(String s)
	 // this method will join 2 string
	 String ss3 = "velocity";
	 
	  String ss4=ss3.concat(" Corporate");
	  
	  System.out.println(ss4); // velocity corporate
	  
	  System.out.println(ss3); // velocity
	  
		
// which is overloaded operator ans--> + operator when used with int it behaves as addition and when used with string it behaves like concatination
		
	
	  
	//6.subString(int beginindex value)
	  //this method will make another string from an existing string by mentioning the index value and the character which are infront from that of index value will be a new string
	  
	String ss5 = "velocity";
	String ss6 =ss5.substring(4);
	
	System.out.println(ss6);
	  
	  
// 7. indexOf(char c)
	// this method will wil give the index count of a specific character
	
	String ss7 ="kjfdndjdjdmvkfioewmvnjccm kjn kvfnjrgan";
	
	 int indexposition =ss7.indexOf('v');//11// this will give the 1st index value of character if repeated
	  
	  System.out.println(indexposition);
	  
// 8. length():
	  // this method will give total number of letter in string
	  
	  String ss8 ="velocity";
	  
	  int leng = ss8.length();
	  
	  System.out.println(leng);
	  
	  
  // program to find index value of each letter
	  
	  String ss9="ddmdjdklvmbnbaiururoele,dnvovsmfj";
	  
	for(int i=0; i<ss9.length(); i++)
	{
	char	charvalue =ss9.charAt(i);
	
	System.out.println("Character : "+charvalue+" index value is : "+i);
	}
	  

	//9. subString (int beginindex , int end)  
	  //this method can form the another string from an existing string by mentioning the index value  from where we have to start and where have to end 
	  
	String ss10 ="abcdef";
	
	String ss11 =ss10.substring(2, 5);
	
	System.out.println(ss11);
	  
	//10. replace (char old, char new)
	 // this method will replace the existing old char with new char
	
	String ss12 ="abcdef";
	
	String ss13 = ss12.replace('a' ,'n');
	
	System.out.println(ss13);
	
	
	//11. replace
	     // this method will replace the old word of string with new word
	
	String ss14 = "this is a String";
	
	String ss15 = ss14.replace("String", "Shubham");
	
	System.out.println(ss15);
	
	//12. to lower case
	    // this method will convert upper case to lower case
	
	String ss16 ="ABCDEF";
	String ss17 = ss16.toLowerCase();
	
	System.out.println(ss17);
	
	//13. to upper case
      // this method will convert lower case to upper case

String ss18 ="abcdef";
String ss19 = ss18.toUpperCase();

System.out.println(ss19);

    // 14 . trim
       // this method will remove the spaces but not middle spaces in the string

String ss20= "         kdjdiaqwurxaegabv87or7nSDKJHB          ";

String ss21 = ss20.trim();

System.out.println(ss21);

String ss22= "this     is a  String"; //try this 


String ss23=ss22.replace(" ", "");

System.out.println(ss23);

//15 . valueOf(any data type)
// this method converts any data type into String

   int a=10;

String instring= String.valueOf(a); // INTO THE PARATHESIS WE CAN GIVE ANY DATATYPE

System.out.println(instring+9);//109

//16. split()
// this method will divide the string and will store it in the  String array form
// this method will eliminate what we mention in paranthesis  and wil store in String Array format


String ss24 = "this is String";
        String[] ss25= ss24.split(" ");
        
      for(String ss26:ss25)
      {
    	  System.out.println(ss26);
      }
        
 // 17. toCharArray
      // this method will convert a String into a Character Array
      
      String ss27 ="velocity";
      
      char [] ss28=ss27.toCharArray();
      
      for(char ch:ss28)
      {
    	  System.out.println(ch);
      }
//18 replaceAll
      //this method will replace all the characters with the desired char we want
      
      String ss29 = "A@#$%^&*()ccent123444ure";
      
      String ss30 = ss29.replaceAll("[a-z]","Q");
      
      System.out.println(ss30);//A@#$%^&*()QQQQQ123444QQQ
      
      String ss31 = ss30.replaceAll("[A-Za-z]","Q");
      
      System.out.println(ss31);
      
      String ss34 = ss29.replaceAll("[0-9]","");

      System.out.println(ss34);



      
 //NOTE : regex : THIS IS AN EXPRESSION WHICH DEFINE THE CATEGORY OF DATA WHETHER IT IS UPPERCASE, LOWERCASE AND NUMERIC INSIDE A STRING
      // [a-z] --> means we are cosiderigng lower case
      //[A-Z]  ----> we are considering upper case
      //[A-Za-z]---> here we are considering both 
      
      
      // method to replace bunch of character with any other (^)
      
    String ss32 = ss29.replaceAll("[^a-z]", "S"); // ^a-z means except small a to z replace other with S

System.out.println(ss32);

String ss33 = ss29.replaceAll("[^A-Za-z]","");

System.out.println(ss33);



// 19.  method to reognize whether the charcter is number or not and in return it will show true if number and false if not

char ch = '1';

boolean isnumber = Character.isDigit(ch); // this method will only chaeck  whether it is number or not and will  return true or false 

System.out.println(isnumber);// true

//programme to remove the umber from string

String ss35 = "dkdkdnm2423ldmcjkm 6784058";
String ss36="";
for(int k=0; k<ss35.length(); k++)
{
	char f = ss35.charAt(k);
	
	if(!(Character.isDigit(f)))
	{
		ss36= ss36+f;
	}
		
		
}
	System.out.println(ss36);


	// 19.  method to reognize whether the charcter is alphaet or not it will  show true if alpha if not false


    boolean isalpha=Character.isAlphabetic('j');
    
    System.out.println(isalpha);


                                         //TO CONVERT ONE DATA TYPE TO ANOTHER WE USE WRAPPER CLASS
    
    
    // to convert String to Primitive data type--> paraseXxx(); method
  
	String s37="45"; //to conver string into integer we use wrapper class
	
	System.out.println(s37+2);//452 
	
	int s39=Integer.parseInt(s37);// in integer wrapper class parseint is a method
	
	System.out.println(s39+2);
	
	
	//=====  // to convert primitive to String Data Type :---> valueOf(); method
	
	String s40 ="false";
	
	boolean s41=Boolean.parseBoolean(s40); 
	
System.out.println(s41);//false

//String s42 = "123e";// this will show exception "numberformatexception"
//
//int s43 =Integer.parseInt(s42);




	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
