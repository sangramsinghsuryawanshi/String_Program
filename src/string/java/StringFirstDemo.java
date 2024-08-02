package string.java;

public class StringFirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'j','a','v','a'};
		String str = new String(c);
		System.out.println("Using char sequence: "+str);
		String str1="Wlecome";
		String str2="Welcome";
		String s=new String("Wlecome");
		System.out.println("String str2 is already present in SCP(str1) it reffer to str2: "+str2);
		System.out.println("creating object using String s: "+s);
	}

}
