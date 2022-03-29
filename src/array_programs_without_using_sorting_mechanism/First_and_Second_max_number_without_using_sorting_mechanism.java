package array_programs_without_using_sorting_mechanism;

public class First_and_Second_max_number_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
		int[] a = {10,50,30,40,20};
		
		int fmax = 0;
		int smax = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>fmax) 
			{
				smax = fmax;
				fmax = a[i];
			}else if (a[i]>smax) 
			{
				smax = a[i];
			}
		}
		System.out.println(fmax +"  "+ smax);
	}
}
