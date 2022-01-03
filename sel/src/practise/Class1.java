package practise;

public class Class1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int a[][] =new int[2][3];
		
		a[0][0] =23;
		a[0][1]=12 ;
		a[0][2] =6;
		
		a[1][0] =13;
		a[1][1]=34 ;
		a[1][2] =26;
		
		Thread.sleep(0);
		
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	
		
	}

}
