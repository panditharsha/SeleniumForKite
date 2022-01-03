package Java_Practise_prg;

public class Sum {

	public static void main(String[] args) 
	{
	    String str = "ahm45a2d2na985gar" ;
	    
	    String s = "";
	    String num = "";
	    
	    s =str.replaceAll("[0-9]","");
	    num =str.replaceAll("[a-z]","");
	    
	    System.out.println(s);
	    System.out.println(num);
	    
	    
		
	}

}
