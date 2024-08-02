package string.java;

import java.util.Scanner;

public class PrintEvenOddCharater {

	public void printEvenOddChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s = sc.nextLine();
		System.out.print("Even Element: ");
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if((i+1)%2==0) {
				System.out.print(ch+" ");
			}
		}
		System.out.print("\nOdd Element: ");
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if((i+1)%2!=0) {
				System.out.print(ch+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEvenOddCharater s = new PrintEvenOddCharater();
		s.printEvenOddChar();
	}

}