package practise;

public class Cons_with_p {
	int num1;
	int num2;
	int num3;
	
	
	 public Cons_with_p(int a,int b) {
		 num1=a;
		 num2=b;
	 }

	 
	 public Cons_with_p (int a,int b ,int c) {
		 num1=a;
		 num2=b;
		 num3=c;
	 }
	public static void main(String[] args) {
		Cons_with_p c = new Cons_with_p(20,10,15);
		c.sum();
		
		Cons_with_p c1=new Cons_with_p(34,24);
		c1.sum();
		

	}
 public void sum()
 {
	  int sum =num1+num2+num3;
	 System.out.println("addition is :"+sum);
 }
}
