package practise;

public class Implemntion_class implements Prac_Interface{
	
	int a =35;
	final int  b =50 ;

	public static void main(String[] args) {
		
		Implemntion_class i=new Implemntion_class();
		i.sum();
	}


	@Override
	public final void sum() {
		 a=a+30 ;

	    System.out.println(a);
	    System.out.println(c);
		
	}

}
