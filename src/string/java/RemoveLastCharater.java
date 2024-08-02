package string.java;

import java.util.Scanner;

public class RemoveLastCharater {

	public void removeLastChar(String str) {
		char ch[] = new char[str.length()-1];
		System.out.println("Deleting last charater: ");
		for(int i=0;i<str.length()-1;i++) {
		char h =str.charAt(i);
			System.out.print(h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		RemoveLastCharater r = new RemoveLastCharater();
		r.removeLastChar(str);
	}

}
