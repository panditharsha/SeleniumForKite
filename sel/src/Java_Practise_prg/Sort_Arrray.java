package Java_Practise_prg;

import java.util.Arrays;

public class Sort_Arrray {

	public static void main(String[] args) {
		 int arr[] = {34,12,6,78,54} ;
		 
		 Arrays.sort(arr);
		 
		 System.out.println("Sorted Array in Asending is: ");
		 for(int i=0 ;i<=arr.length -1;i++)
		 {
			 System.out.print(" "+arr[i]);
		 }
		 
		 System.out.println();
		 
		 System.out.println("Descending order Array is:");
		 
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 System.out.print(" "+arr[i]);
		 }
		 System.out.println();
	}

}
