package string.java;

import java.util.Scanner;

public class RemoveDuplicateString {
	public void removeDuplicate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s = sc.nextLine();
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		char ch='\u0000';
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j])
				{
					c[j]=ch;
				}
			}
		}
		String strnew = ""; 
		for(int i=0;i<c.length;i++) {
			if(c[i]!=ch) {
				strnew = strnew+c[i];
				//System.out.print(c[i]);
			}
		}System.out.println("After deleted duplicat charater :"+strnew);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateString r = new RemoveDuplicateString();
		r.removeDuplicate();
	}

}
