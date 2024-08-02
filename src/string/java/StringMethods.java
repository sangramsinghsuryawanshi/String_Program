package string.java;

import java.util.Scanner;

public class StringMethods {
	public void charAtMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s = sc.nextLine();
		System.out.println("Enter given index: ");
		int i = sc.nextInt();
		System.out.println("Using charAtMethod : "+s.charAt(i));
	}
	public void compareTo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s = sc.nextLine();
		System.out.println("Enter second String: ");
		String s1 = sc.nextLine();
		if(s.compareTo(s1)>0) {
			System.out.println(s+" is grater than "+s1);
		}else if(s.compareTo(s1)<0) {
			System.out.println(s1+" is grater than "+s);
		}else {
			System.out.println("Both are equal");
		}
	}
	public void compareToIgnore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s = sc.nextLine();
		System.out.println("Enter second String: ");
		String s1 = sc.nextLine();
		if(s.compareToIgnoreCase(s1)>0) {
			System.out.println(s+" is grater than "+s1);
		}else if(s.compareTo(s1)<0) {
			System.out.println(s1+" is grater than "+s);
		}else {
			System.out.println("Both are equal");
		}
	}
	public void concatTwoString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s = sc.nextLine();
		System.out.println("Enter second String: ");
		String s1 = sc.nextLine();
		System.out.println("Concating two string: "+s.concat(s1));
	}
	public void contains() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s = sc.nextLine();
		System.out.println("Enter second String: ");
		String s1 = sc.nextLine();
		if(s.contains(s1)==true) {
			System.out.println(s+" is present in "+s1);
		}else {
			System.out.println(s+" is not present in "+s1);
		}
	}
	public void trimRemovingSpace() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s ="  hello   ";
		String str = s.trim();
		System.out.println("Before trim the charater: "+s);
		System.out.println("After trim the charater: "+str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethods s = new StringMethods();
		s.charAtMethod();
		s.compareTo();
		s.compareToIgnore();
		s.concatTwoString();
		s.contains();
		s.trimRemovingSpace();
	}

}
