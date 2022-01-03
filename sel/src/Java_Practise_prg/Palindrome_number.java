package Java_Practise_prg;

public class Palindrome_number {

	public static void main(String[] args) {
		int a =123321 ;	 
	    int b =0;
	    int c=a;
		 
		 while(a!=0) 
		 {
			 int r =a%10;
			 b=b*10+r ;			      
		     a=a/10 ;    		                 	 
		 }
		// System.out.println(c);
		 System.out.println(b);
		
		 if(c==b)
		 {
			 System.out.println("Number is Palindrome");
		 }
		 else 
		 {
			 System.out.println("number not palindrome");
		 }
		 
		        
	
	

	}

}
