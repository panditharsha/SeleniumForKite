package Java_Practise_prg;

public class Count_of_words {
	
	public static void main(String[] args) {
		String sent = "This is very important task you have to do it";
		
		String ref =" ";
		int count =0;
		
		 String op[]=sent.split(ref) ;
		 
		// System.out.println(op.length);
		 
		 
		for(int i=1;i<=op.length;i++)
		{
			count ++ ;
		}
		
		System.out.println(count);
	}
	
	
	

}
