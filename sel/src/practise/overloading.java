package practise;

public class overloading {

	public static void main(String[] args) {
		overloading o =new overloading();
		o.area(15, 10);
		o.area(10, 12, 5);

	}
		public void area(int a ,int b)
		{
		  int area =a*b;
		  System.out.println("area is :"+area);
		}
		
		public void area(int a,int b,int c)
		{
			int area =a*b*c;
			System.out.println("total area is :"+area);
		}
}
