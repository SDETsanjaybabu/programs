package array_programs_without_using_sorting_mechanism;

public class First_and_Second_min_number_without_using_sorting_mechanism 
{
	public static void main(String[] args) {
		
			int[] a = {2,2,10,1,2,30,40,1};
			
			int fmin = a[0];//2 2  2 1
			int smin = a[0];//2 10 2 2
			
			for (int i = 0; i < a.length; i++) // 0 1 2  3 4 5  6   7
				                               // 2 2 10 1 2 30 40  1
			{
				if (a[i]<=fmin) //2<=1
				{
					if(a[i]!=fmin)
					{
						smin = fmin;
					}
					fmin = a[i]; 
				}
				else if(fmin==smin || smin>a[i])
				{
					smin=a[i];
				}
			}
			
			System.out.println("first minimum = "+fmin);
			System.out.println("second minimum = "+smin);

	}
}
