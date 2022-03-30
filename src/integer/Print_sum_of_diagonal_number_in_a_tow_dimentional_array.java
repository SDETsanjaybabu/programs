package integer;

public class Print_sum_of_diagonal_number_in_a_tow_dimentional_array 
{
	public static void main(String[] args) {
		//int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum+arr[i][i];
		}
		System.out.println(sum);
	}
}
