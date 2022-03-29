package integer;

public class Print_only_PRIME_NUMBERS_in_an_array 
{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			boolean flag = false;
			
			for (int j = 2; j < arr[i] ; j++) 
			{
				if (arr[i]%j==0) 
				{
					flag=true;
					break;
				}
				
			}
			if (arr[i]==1) 
			{
				flag = true;
			}
			if (!flag) 
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
