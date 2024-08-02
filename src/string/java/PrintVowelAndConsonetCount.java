package string.java;

import java.util.Scanner;

public class PrintVowelAndConsonetCount {

	public void vowelAndConsonet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s1 = sc.next();
		int c=0,c1=0;
		for(int i=0;i<s1.length();i++){
			char ch =s1.charAt(i);
			if( ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='i') {
				c++;
			}
			else {
				c1++;
			}
		}
		System.out.println("Given cout of vowel is: "+c);
		System.out.println("Given count of consonent is: "+c1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintVowelAndConsonetCount s = new PrintVowelAndConsonetCount();
		s.vowelAndConsonet();
	}

}