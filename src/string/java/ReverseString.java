package string.java;

import java.util.Scanner;

public class ReverseString {

	public void reverseStrinEle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s = sc.nextLine();
		char ch[]=new char[s.length()];
		int ind=0;
		for(int i=s.length()-1;i>=0;i--) {
			ch[ind]=s.charAt(i);
			ind++;
		}
		System.out.print("\nGiven reverse String is: ");
		for(int i=0;i<s.length();i++) {
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString s = new ReverseString();
		s.reverseStrinEle();
	}

}