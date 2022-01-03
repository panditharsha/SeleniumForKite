package Java_Practise_prg;

public class Vowel_Count {

	public static void main(String[] args) {
		
	String s ="ahemadnagari";
		
	int ct =0;
		
for(int i=0;i<=s.length()-1;i++)
{
 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
	 ct ++ ;
	}
}
	System.out.println("Count of vowel: "+ct);
		
					

	}

}
