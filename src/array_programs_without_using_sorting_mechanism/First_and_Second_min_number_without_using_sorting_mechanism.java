package array_programs_without_using_sorting_mechanism;

public class First_and_Second_min_number_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
		
			int[] a = {50,70,10,2,30,40,20,3};
			
			int fmin = a[0];
			int smin = a[1];
			
			for (int i = 1; i < a.length; i++) 
			{
				if (a[i]<fmin) 
				{
					smin = fmin;
					fmin = a[i];
				}else if (a[i]!=fmin) 
				{
					if (a[i]<smin) 
					{
						smin=a[i];
					}
				}
			}
			
			System.out.println("first minimum = "+fmin);
			System.out.println("second minimum = "+smin);

	}
}
