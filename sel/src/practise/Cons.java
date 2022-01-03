package practise;

public class Cons {
	int a =25;
	String  city ;
	
	public Cons()
	{
		city ="Pune";
	}

	public static void main(String[] args) {
		Cons c=new Cons();
		c.display();
			

	}
  public void display()
  {
	  int a =50;
	  System.out.println("value of a is:"+ this.a);
	  System.out.println("city is:"+city);
	  
  }
}
