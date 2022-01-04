package stingClassDisscussion;


//very important topic

public class HeapAndSCPDifference {

	//heap and scp are memory which is related to string
	//SCP - STRING CONSTATNT POOL
public static void main(String[] args) {
	
	
	// 1.two ways to define a String
	
	String s="def";// this consume only Scp memory 
	
	String s1="def";
	
	String s2= "abc";  //1st// this will create the object only in SCP AND IF WE MAKE THE OBJECT WITH SAME VALUE IN STRING IT WILL ONLY SHARE TH REF VARIABLE
	
	
	//2ND
	String ss=new String("abc");//2nd// THIS WILL CREATE THE OBJECT IN SCP AND HEAP AREA BUT SCP DOESNT ALLOW OBJECTS CREATION IF THE VALUES ARE REPEATED(SAME) if done SCP will only share the ref variablr
	String ss1=new String("abc");// this consume extra memory(heap+Scp) so we dont prefer this
	String ss2=new String("abc");
	
	
	//NOTE--> WHEN WE CREATE THE OBJECT OTHER THAN STRING IT WILL CREATE OBJECT ONLY IN HEAP MEMORY AND NOT IN THE SCP
	// BUT WHEN WE CREATE THE OBJECT OF STRING IT WILL CREATE THE OBJECT IN HEAP MEMORY AND SCP
	// OBJECTS CREATED IN SCP ARE HOLD UNLESS THE JVM GET SHUTDOWN
	

	
	      //2.EQUALS METHOD ---> this is for content comparison
	
	 boolean isequal =s.equals(s1); // s and s1 has same content def
	
	 System.out.println(isequal);
	 
	 
	 // 3 ==  ----> this is for refrence variable comparison  (jab do ref variiable  do alag object ko point krte hai(ek heap memory me and ek Scp me) tab false AUR agar same ref variable ko point krte hai true
	 
	boolean isequalref = s2==ss; //false// s2 and ss are not pointing same object here s2 is pointing object which is in SCP memory and ss is pointing the object in heap memory
	
	System.out.println(isequalref);
	
	boolean ispointingsame = s==s1;// true// here s and s1 are pointing the object in  scp memory
	
	System.out.println(ispointingsame);
	
	System.out.println(s+"xyz");//defxyz
	
	System.out.println(s);//def// here vlue of s will not be change  sinCE STRING IS IMMUTABLE(I.E WE CANNOT CHANGE THE ORIGINAL VALUE) but when we assign the changed value in ref variable then it will change and not by concatination
	
	  //4. String Buffer class
	
	StringBuffer sb = new StringBuffer("abc");
	
	sb.append("tuv");// abctuv// string buffer is mutable i.e we can change the value of original string value using stringbuffer class
	
}
	

	
	
}
