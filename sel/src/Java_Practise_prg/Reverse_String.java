package Java_Practise_prg;

public class Reverse_String {
	
	public static void main(String[] args) {
	
		String s ="MADAM";
		
		String R ="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			R=R+s.charAt(i);
		}
		
		System.out.println(s);
		System.out.println(R);
		
		if(s.equals(R))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("No Palindrome");
		}
}
}