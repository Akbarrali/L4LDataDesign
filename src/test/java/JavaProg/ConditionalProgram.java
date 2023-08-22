package JavaProg;

public class ConditionalProgram
{

	public static void Calendr()
	{
		
		int month = 2;
		
		switch(month)
		{
		case 1: 
			System.out.println("THis is jan"); 
			break;
		case 2: 
			System.out.println("THis is frb");  
			break;
		case 3 : 
			System.out.println("this is march");  
			break;
		case 4 : 
			System.out.println("This is April");  
			break;
		default: 
			System.out.println("Holiday");
		
		}
		
			
	}
	
	
	
	public void gender()
	{
	
		String gend = "m";
		
		switch(gend)
		{
			case "Male": System.out.println("this is male"); break;
			case "Femele": System.out.println("this is femele"); break;
			default: System.out.println("public");		
		}
		
	}
	
	
	public static void characterrr()
	{
		String ch = "a";
		String text = "a";
		
		if (text == "a")
		{
			switch(ch) 
			{ 
			case "A" : System.out.println("This is vowel"); break;
			case "a" : System.out.println("This is Constant"); break;
			default : System.out.println("Noraml Text"); break;
			}
		}
			else 
			{
				System.out.println("Not text");
			}
		
		}

		
	
	public static void vote()
	{
		int age = 15;
		
		if(age >= 18)
		{
			System.out.println("You are eligible for vote");
		}
		else 
		{
			System.out.println("Not Eligible");
		}
		
		
	}
	
	public static void main(String[] args)
	
	{
		
		ConditionalProgram.Calendr();
		ConditionalProgram.characterrr();
		ConditionalProgram.vote();
		ConditionalProgram CP = new ConditionalProgram();
		
		CP.gender();
		
		
		int a = 100; 
		int b = 20;
		int c = 50;
		
		if(a>b)
		{
			System.out.println("A is grater");
		}
		else if(b>c)
		{
			System.out.println("B is grater");
		}
		
		else
		{
			System.out.println("C is greater");
		}

	}

}
