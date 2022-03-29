package integer;

import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter key");  
		int key= sc.nextInt();
		
		int a[] = {1,2,3,4,5};
		
	
		for (int i = key; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < key; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
