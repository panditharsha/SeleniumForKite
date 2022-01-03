package Java_Practise_prg;

import java.util.Scanner;

public class Space_count {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the String:");
		 String s1 = sc.nextLine();
		 
		 int c =0;
		 for(int i=1;i<=s1.length()-1;i++)
		  {
			  char s =s1.charAt(i);
			  if(s==' ')
			  {
				  c++ ;
			  }
		  }
		  System.out.println("c is "+c);			
	}

}
