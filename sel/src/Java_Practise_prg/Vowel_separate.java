package Java_Practise_prg;

public class Vowel_separate {

	public static void main(String[] args) {
		String s ="elephant";
		
		String ch="";
		String vo ="";
	    
		
		for(int i=0;i<=s.length()-1;i++)
		{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
		 {
			vo =vo+s.charAt(i);
			
		 }
		else
		{
			ch=ch+s.charAt(i);
		}
	}		
		System.out.println("vowel of the string are:"+vo);
		System.out.println("Char string is:"+ch);
		
		System.out.println("vowel is "+vo.length());
	}

}
