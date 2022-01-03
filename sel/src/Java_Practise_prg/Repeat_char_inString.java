package Java_Practise_prg;

import java.util.Arrays;
import java.util.Collections;



public class Repeat_char_inString {

	public static void main(String[] args) {
		 String s = "ahmadnagarandpune";
		 int count ;
		 
		char arr[] =s.toCharArray() ;
		 
		System.out.println("The repeat charcters are :");
		 for(int i=0;i<arr.length;i++)
		 {
			 count =1;
			 for(int j=i+1;j<arr.length;j++)
			 {
				if(arr[i]==arr[j] ) 
				{
					count ++ ;
					arr[j]= 0;
				}
			 }
			 if(count >1 && arr[i] !=0)
			  {
				  System.out.println(arr[i]);
				  System.out.println();
			  }
		 }
		  
	   	 

	}

}
