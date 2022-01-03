package Java_Practise_prg;

public class Array_sort_without_method {

	public static void main(String[] args) {
		int array[]= {29,65,12,7,55,2,90};
		int t =0;
		
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]<array[i+1])
			{
				t =array[i];
				
			}
			System.out.println(array[i]);
		}

	}

}
