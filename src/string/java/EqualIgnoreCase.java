package string.java;

import java.util.Scanner;

public class EqualIgnoreCase {
	public void isIngnoreCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		System.out.println("Enter second String: ");
		String s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both String is equal to each other");
		}else {
			System.out.println("Both are not equal");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualIgnoreCase e = new EqualIgnoreCase();
		e.isIngnoreCase();
	}

}
