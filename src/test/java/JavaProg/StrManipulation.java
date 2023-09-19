package JavaProg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
	
	public static void stmethods()
	{
		String x = "THis is Testing Training";		
		String spt[] = x.split("t");		
		for(int i = 0; i<spt.length; i++)
		{
			System.out.println(spt[i]);
		}
	}
	
	public static void rmv()  
	{

		Set<String> set = new HashSet<String>();
		set.add("Test");
		
		Iterator itr = set.iterator();
		char ch = (char) itr.next();
		System.out.println(ch);
		
		for(int i= 0; i<set.size(); i++)
		{
			System.out.println(itr.next());
		}
		
				
	}
	
	
	public static void tes()
	{
		String s1 = "THis_is_08/08/2023";
		
		String s2[] = s1.split("_");
		System.out.println(s2[2]);
	}
	
	
	
	
	
	public static void main(String[] args)
	{ 
		//StrManipulation.revstr();
		StrManipulation.stmethods();
		//StrManipulation.rmv();
		StrManipulation.tes();
//		String srt = "Automation";
//		System.out.println(srt.replace("", " "));
//		System.out.println(srt.trim());
		
		
		
		
		
	}

}
