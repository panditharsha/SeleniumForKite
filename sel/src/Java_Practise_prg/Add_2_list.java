package Java_Practise_prg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Add_2_list {

	public static void main(String[] args) {
		 ArrayList a1 =new ArrayList();
		 
		 a1.add("harsha");
		 a1.add(45);
		 a1.add("kia");
		 a1.add(60);
		 a1.add("45");
		 
		 
		 System.out.println(a1);
		 
		 ArrayList a2 =new ArrayList();
		 a2.add("pallvi");
		 a2.add("appy");
		 a2.add(100);
		 System.out.println(a2);
		 
		 ArrayList A3 =new ArrayList();
		 A3.addAll(a1);
		 A3.addAll(a2);
		 
		 System.out.println("New list is:"+A3);
		 
		 Iterator it = a1.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		
	}

}
