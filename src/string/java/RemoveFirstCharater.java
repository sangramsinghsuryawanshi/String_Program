package string.java;

import java.util.Scanner;

public class RemoveFirstCharater {

	public void removeFirstChar(String str) {
		char ch[] = new char[str.length()];
		System.out.println("Deleting first charater: ");
		for(int i=1;i<str.length();i++) {
		char h =str.charAt(i);
			System.out.print(h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		RemoveFirstCharater r = new RemoveFirstCharater();
		r.removeFirstChar(str);
	}

}
