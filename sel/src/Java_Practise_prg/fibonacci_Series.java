package Java_Practise_prg;

public class fibonacci_Series {

	public static void main(String[] args) {
		int num =10;
		
		int a =0;
		int b =1;

		
		for(int i=1;i<=num;i++)
		{
			System.out.println(a);
			int fibo=a+b;
			a=b;
			b=fibo;
			
		}
		
		
	}

}
