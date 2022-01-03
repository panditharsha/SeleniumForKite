package Java_Practise_prg;

import java.util.Scanner;

public class Multiplication_without {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter num1:");
		 int num1 =sc.nextInt();
		 System.out.println("Enter num2:");
		 int num2 =sc.nextInt();
		 int sum =0;
		 
		 for(int i=1;i<=num1;i++)
		 {
			 sum=sum+num2 ;
		 }
		 System.out.println(sum);
	}

}
