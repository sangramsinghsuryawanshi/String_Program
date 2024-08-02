package string.java;

import java.util.Scanner;

public class ReverseOfString {
	public void reverseString(String s,String str) {
		System.out.print(" ");
		for(int i=str.length()-1;i>=0;i--) {
			s+=str.charAt(i);
		}
		System.out.println("Given reverse String is: "+s);
		if(s.equals(str)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Given String is not palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String s="";
		ReverseOfString r = new ReverseOfString();
		r.reverseString(s,str);
	}

}
