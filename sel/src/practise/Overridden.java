package practise;

public class Overridden extends overloading  {

	public static void main(String[] args) {
		Overridden ov = new Overridden();
		ov.area(10, 5);
		ov.area(2, 5,8);
		
		
		overloading o =new overloading();
		o.area(12, 10);
		
		
		
		

	}
   public void area(int a ,int b)
   {
	    int area =a*b;
	   System.out.println("Area in overriding method:"+area);
   }
}
