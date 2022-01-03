package Java_Practise_prg;

public class ArmStrong_number {
	 public static  void main(String[] args) 
	 {
		 int num =407;
		 int  b= 0 ;
		 
		 for(int i=num ;i>0; i=i/10)
		 {
			 int r =i%10;
			 b =b+(r*r*r);
			 
		 }
		 System.out.println(b);
		 if(num==b)
		 {
			 System.out.println("Number is armstrong ");
		 }
	 }

}
