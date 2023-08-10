
public class ArrayPrectice 

{

	public void dup()
	{
		String name = "John";
		for (int i=name.length(); i>=1; i--)
		{
			char ch = name.charAt(i-1);
			System.out.print(ch);
		}
		
	}
	
	public static void main(String[] args)
	{
		
		int credit [] = new int[5];
		
		credit[0]= 10;
		credit[1]= 20;
		credit[2]= 30;
		credit[3]= 30;
		credit[4]= 30;
		
		//System.out.println("Credit 1 value is " +credit[1]);
		
		for(int i = 0; i<credit.length; i++)
		{
			System.out.println(credit[i]);
		}
		
		
		ArrayPrectice obj = new ArrayPrectice();
		obj.dup();
		
		
	}

}
