package string.java;

import java.util.Scanner;

public class LowerAndUpperCaseString {

	public void isLower() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		s=s.toLowerCase();
		System.out.println("Given String in LowerCase: "+s);
	}
	public void isUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		s=s.toUpperCase();
		System.out.println("Given String in UpperCase: "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerAndUpperCaseString s = new LowerAndUpperCaseString();
		s.isLower();
		s.isUpper();
		
	}

}
