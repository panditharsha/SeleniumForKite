package Java_Practise_prg;

public class Separate_digit_and_char {

	public static void main(String[] args) {
		String s = "har4532s21ha57da";
		
		String num = "";
		String ch = "";
			
		ch =s.replaceAll("[0-9]","");
		num=s.replaceAll("[a-z]","");
			
		System.out.println(ch);
		System.out.println(num);

	}

}
