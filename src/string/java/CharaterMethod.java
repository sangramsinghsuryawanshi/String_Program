package string.java;

import java.util.Scanner;

public class CharaterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s = sc.nextLine();
		char ch=s.charAt(0);
		System.out.println("Character in upper case: "+Character.isUpperCase(ch));
		System.out.println("Character in lower case: "+Character.isLowerCase(ch));
		System.out.println("Character in digit "+Character.isDigit(ch));
		System.out.println("Character in whiteSpace: "+Character.isWhitespace(ch));
		System.out.println("Character in alphabetica: "+Character.isAlphabetic(ch));
		System.out.println("Character in string: "+Character.toString(ch));
	}

}
