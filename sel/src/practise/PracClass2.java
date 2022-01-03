package practise;

import java.util.ArrayList;
import java.util.HashSet;

public class PracClass2 extends PracClass {

	public static void main(String[] args) {
		
	  ArrayList a =new ArrayList();
	  
	  a.add("harsha");
	  a.add("50");
	  a.add(300);
	  a.add("sam");
	  a.add("akshay");
	  a.add("vaishnav");
	  a.add(4,500);
	  
	  System.out.println(a.containsAll(a));
	  System.out.println(a);
	;

	  
	  for(Object o:a)
	  {
		  System.out.println(o);
	  }
	  
	  
	  
	    
	    

	}

}
