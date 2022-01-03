package Java_Practise_prg;

public class VowelPresent_orNot_inString {

	public static void main(String[] args) {
		
		String str ="ioharshadie" ;
		char v ='t';
		
		for( int i=0 ;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
					{
				System.out.println("The character at "+i+" th position is Vowel");

					}
		}
	}

}
