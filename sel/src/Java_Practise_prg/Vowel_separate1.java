package Java_Practise_prg;

public class Vowel_separate1 {

	public static void main(String[] args) {
		
		String s ="ahemadnagarcity";
		  
	    String  vowel =s.replaceAll("[^aeiou]","");
	     
	     System.out.println(vowel);
	}

}
