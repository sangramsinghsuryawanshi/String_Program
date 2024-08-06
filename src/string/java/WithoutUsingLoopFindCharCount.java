package string.java;

public class WithoutUsingLoopFindCharCount 
{
	
	public static void main(String[] args) 
	{
		String s="sangrprogrsmmingam";
		String c="r";
		int l = s.length();
		String str=s.replace(c, "");
		System.out.println(l-str.length());
	}

}
