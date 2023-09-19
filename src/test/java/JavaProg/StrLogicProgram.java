package JavaProg;



public class StrLogicProgram 
{
	
	
	public static void reverseStr()
	{
		String str = "Automation";
		
		for(int i=str.length()-1; i>=0; i--)
		{			  
			char ch =  str.charAt(i);
			System.out.print(ch);
		}		
	}
	
	public static void Palindrom()
	{
		String str = "madam";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{			  			
			rev = rev + str.charAt(i);			
		}	
		if(str.contains(rev))
		{
			System.out.println("String is Palimdrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}
	

	public static void main(String[] args)
	{
		//StrLogicProgram.reverseStr();
		StrLogicProgram.Palindrom();
		
		String a = "rock";
		String b = "k";
		System.out.println("A is contains b "+a.contains(b));
		
		
		
	}

}
