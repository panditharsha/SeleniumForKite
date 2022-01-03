package Java_Practise_prg;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_int_List {

	public static void main(String[] args) {
		 ArrayList a =new ArrayList();
		  a.add(23);
		  a.add(56);
		  a.add(8);
		  a.add(27);
		  a.add(89);
		  a.add(76);
		  
		  Collections.sort(a);
		  System.out.println("List in Ascending order:"+a);
		   
		  Collections.sort(a,Collections.reverseOrder());
		  System.out.println("List in Descending order is:"+a);
		  

		   

	}

}
