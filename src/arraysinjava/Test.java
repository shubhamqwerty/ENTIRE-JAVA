
// ARRAY IS USED TO GROUP THE SAME TYPE OF ENTITY(DATA TYPE) AS A SINGLE ENTITY

public class Test {

	public static void main(String[] args) {
		
		
		//1. FIRST WAY TO DEFINE ARRAY --> BY CREATING OBJECT
		
		int [] a = new int[5];// here  name of array=a 
                             //[] ---> we can define the size of array in it .  for now we have define it as 5 i.e it will hold only 5 integer		
		                    // we can make array of any data type
	
         a[0]=20;	
         a[1]=30;	
         a[2]=40;
         a[3]=50;
         a[4]=60;
         //a[5]=70; // THIS WILL NOT BE STORED SINCE THE LIMIT IS ALREADY FIXED 

//System.out.println(a[5]);// this will not be printed since the size of array is already fixed and if we try to add another element  then we will get  ARRAYINDEXOUTOFBOUND exception

System.out.println(a[3]);//50

// to find the length of array

int leng = a.length;
System.out.println(leng);//5

// program to print all arrays

for(int i=0 ; i<leng ; i++)
{
	System.out.println(a[i]);
}

System.out.println("*********************");

for(int y:a) // this is FOR EACH loop on this basis we can iterate the arrays AND  FOR EACH LOOP IS USED WHERE THE ELEMNTS ARE STORED IN GROUP
{
	System.out.println(y); // this will print the each value stored in array
}

// 2. 2nd WAY TO DEFINE ARRAY

int [] s = {20,30,40,50,60}; //  the size of array is 5 // but this type is not preferabble

String [] t = {"adsf", "sdfkm", "fghhhrd"};

System.out.println(t[2]); // this will the value of 3rd string stored in t
	
System.out.println(s[3]);// this will pront the value 5th array stored in s

for(String k:t)
{
	System.out.println(k);
}

System.out.println("***************");

for(String k:t)
{
	if(k.equals("adsf"))// applying condition on k
	{
		System.out.println(k);// adsf
	}
}
 // wap to add all elements of array
// WAP TO PRINT EVEN INDEX VALUE
//WAP TPO PRNT THE SUM OF EVEN INDEX







	}
	
	
	
	
}
