package JavaProg;

public class StrManipulation 
{

	public static void revstr()
	{
	String srt = "Simform";
	String Test = srt.replace("", " ");
	for(int i = Test.length(); i>=1; i--)
		{
		  
			char ch = Test.charAt(i-1);
			System.out.print(ch);			
		}
	
		}
	
	
	public static void main(String[] args)
	{ 
		StrManipulation.revstr();
		
//		String srt = "Automation";
//		System.out.println(srt.replace("", " "));
//		System.out.println(srt.trim());
		
		
		
		
		
	}

}
