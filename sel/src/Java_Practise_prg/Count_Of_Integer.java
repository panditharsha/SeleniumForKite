package Java_Practise_prg;

public class Count_Of_Integer {

	public static void main(String[] args) {
	
		int num =67490 ;
		
		int count =0;
		
		do
		{
			num =num/10;
			count++ ;
		}while(num !=0) ;
		
		System.out.println("total no. of Digit :"+count);
		
		

	}

}
