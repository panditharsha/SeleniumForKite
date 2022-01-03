package Java_Practise_prg;

public class Prime_number {

	public static void main(String[] args) {
	
		int n =18 ;
		boolean result =true ;
		
		
		for(int i=2;i<=n/2;i++)
		{
			 int t =n%i ;
			 if(t==0) 
			 {
				 result=false ;
				 break ;
				 
			 }
			 
			
		}
		System.out.println(result);

	}

}
