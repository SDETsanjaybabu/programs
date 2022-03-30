package string;


public class Print_order_of_occurance_of_string 
{
	public static void main(String[] args) 
	{
		String s = "aabbbcccca";
		char c = 'a';
	  for (char i = c; i <='z'; i++) 
	  {
		
		for (int j = 0; j < s.length(); j++)
		{
			int count = 0;
			if (i==s.charAt(j))
			{
				count++;
				System.out.println(i);
			}else if (i!=s.charAt(j)) 
			{
				i++;
			}
			
		}
		//System.out.println(i+" = "+count);
	  }
	}
}
