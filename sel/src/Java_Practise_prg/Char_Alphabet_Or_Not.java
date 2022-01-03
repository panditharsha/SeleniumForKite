package Java_Practise_prg;

public class Char_Alphabet_Or_Not {

	public static void main(String[] args) {
		char input ='A';
		
		if(input>='a' && input <='z' || input>='A' && input <='Z')
		{
			System.out.println("Char is Alphabet");
		}
		
		else
		{
			System.out.println("Char is not alphabet");
		}

	}

}
