package string.java;

import java.util.Scanner;

public class DeleitingLastAndFirstEleFromString {

	public void removeFirst() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s = sc.nextLine();
		char ch[]=new char[s.length()];
		int ind=0;
		System.out.print("\nRemoved first char String is: ");
		for(int i=1;i<s.length();i++) {
			ch[ind++]=s.charAt(i);
		}
		for(int i=0;i<s.length()-1;i++) {
			System.out.print(ch[i]);
		}
	}

	public void removeLast() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 1 String: ");
		String s = sc.nextLine();
		char ch[]=new char[s.length()];
		int ind=0;
		System.out.print("\nRemoved first char String is: ");
		for(int i=s.length()-1;i>=0;i--) {
			ch[ind++]=s.charAt(i);
		}
		for(int i=0;i<s.length()-1;i++) {
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleitingLastAndFirstEleFromString s = new DeleitingLastAndFirstEleFromString();
		s.removeFirst();
		s.removeLast();
	}

}
