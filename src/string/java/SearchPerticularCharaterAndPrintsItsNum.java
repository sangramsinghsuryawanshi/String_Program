package string.java;

import java.util.Scanner;

public class SearchPerticularCharaterAndPrintsItsNum {

	public void searchChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s = sc.nextLine();
		System.out.println("Enter index: ");
		int s1 = sc.nextInt();
		char ch =s.charAt(s1);
		System.out.println("Given char index is: "+ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchPerticularCharaterAndPrintsItsNum s = new SearchPerticularCharaterAndPrintsItsNum();
		s.searchChar();
	}

}