
public class StringConcept 
{
	String name = "Selinum";
	//int len = name.length();

	public void Rnumber() 
	{
		for(int i=name.length(); i>=1; i--)		
		{
			char rev = name.charAt(i-1);	
			System.out.println(rev);
		}		
	}
	
	
	public void wovelText()
	{
		String srt = "Selinum";
		
	    for(int i = 1; i<=srt.length(); i++)
	    {
	    	char wov = srt.charAt(i);
	    	String wovel = "A || E || I || O || U";
	    	if(wovel.matches(srt))
	    	{
	    		System.out.println("Yes");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("No");
	    	}
	    }
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(java.lang.String[] args) 
	{
		StringConcept obj = new StringConcept();
		//obj.Rnumber();
		obj.wovelText();
		
		
		
//		String str = "Hello Welcome in 2025";
//		int lenght = str.length();
//		System.out.println("Lenght is"+ lenght);
//		char name = str.charAt(20);
//		System.out.println("Value is "+name);
//		
//	   String rep = str.replace("5", "7");
//	   System.out.println(rep);
		
		
		
	}

}
