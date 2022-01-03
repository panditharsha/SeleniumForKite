package practise;

public class ConstructorPrac {
	int a ;
	int b ;
	public static void main(String[] args) {
		
		ConstructorPrac c= new ConstructorPrac(30, 15);
		c.add();

	}
	
	public ConstructorPrac(int c,int d) 
	{
		 a =c;
		 b =d ;
	}
	
	public void add() 
	{
		
		int c =15;
		int sum = a+b ;
		System.out.println("Sum of the number :"+sum);
	}
}
