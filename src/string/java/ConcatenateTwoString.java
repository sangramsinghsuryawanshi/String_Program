package string.java;

import java.util.Scanner;

public class ConcatenateTwoString {

	public void concat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s = sc.nextLine();
		System.out.println("Enter 2 String: ");
		String s1 = sc.nextLine();
		s=s.concat(s1);
		System.out.println("Concatenated String is: "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatenateTwoString s = new ConcatenateTwoString();
		s.concat();
	}

}