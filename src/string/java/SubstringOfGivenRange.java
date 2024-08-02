package string.java;

import java.util.Scanner;

public class SubstringOfGivenRange {
	public void subStringMethod(String str) {
		System.out.println("Given range of string 1 to 4 is: "+str.substring(1,4));
	}
	public void contains(String str,String str1) {
		if(str.contains(str1)==true) {
			System.out.println(str+" present in "+str1);
		}else {
			System.out.println(str+" Not preset in "+str1);
		}
	}
	public void stratAndEndWith(String str,String str1) {
		if(str.startsWith("h")) {
			System.out.println(str+" start with 'h'");
		}else {
			System.out.println(str+" is not start with 'h'");
		}
		if(str.endsWith("a")) {
			System.out.println(str+" end with 'a'");
		}else {
			System.out.println(str+" is not end with 'a'");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 string: ");
		String str = sc.nextLine();
		System.out.println("Enter 2 string: ");
		String str1 = sc.nextLine();
		SubstringOfGivenRange r = new SubstringOfGivenRange();
		r.subStringMethod(str);
		r.contains(str,str1);
		r.stratAndEndWith(str, str1);
	}

}
