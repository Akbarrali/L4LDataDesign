package JavaProg;

public class StrnBasic
{
	 int age = 25;
	 String name = "Mahi";
	
	public void testClass(int age, String name)
	{
		System.out.println("this is age " +age);
		System.out.println("this is name " +name);
	}
	
	
	
	public static void main(String[] args) 
	{
		StrnBasic obj = new StrnBasic();
		obj.testClass(30, "alan");
		
		
		String s = "Hello";
		String s1 = new String();
		String C  = s1.concat(s); // To merge two string 
		//System.out.println(C);

		String str = "automation";
		String st = "Automation";
		System.out.println(str.isEmpty());  // To check string is Empty - return boolean
		boolean equal = str.equals(st);   // To check true and false condition  
		System.out.println(equal);
		System.out.println(str.equalsIgnoreCase(st)); //To ignore the case sensitive 
		String jn = String.join("**", str, st); // Is use to join two string (With the use of String Class)
		System.out.println(jn); //
		
		String x = "JavaAutomation";
		System.out.println("length is "+ x.length());
		System.out.println(x.substring(6));
		System.out.println("Sub String is " + x.substring(6, 9));
		String subst = x.substring(6, 9);
		System.out.println("Sub Sequence is "+ x.subSequence(6, 9));
		CharSequence subseq = x.subSequence(6, 9);
		
		System.out.println("Sequence is " + x.replace(" ", ""));
		System.out.println("Sequence is " + x.replace("A", "@"));
		
		System.out.println("Index is "+ x.indexOf("v"));
		System.out.println("Last Index Of "+ x.lastIndexOf("a"));
		System.out.println("Char of "+ x.charAt(5));
		System.out.println(x.contains("o"));
		System.out.println(x.startsWith("o"));
		System.out.println(x.endsWith("o"));
		
		String name = "javaclass";
		
		char[] ch = name.toCharArray();
		String change = ch.toString();
		System.out.println(change);
		int charlenght = ch.length;
		int charlenght1 = ch.length;
		System.out.println(charlenght);
		
	}

}
