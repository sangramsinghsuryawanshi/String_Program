package string.java;

import java.util.Scanner;

public class SearchPerticularUser {
	public void searchUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 String: ");
		String s = sc.nextLine();
		System.out.println("Enter 2 String: ");
		String s1 = sc.nextLine();
		if(s.contains(s1)) {
			System.out.println(s1+" is present in "+s);
		}
		else {
			System.out.println(s1+" is not present in "+s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchPerticularUser s = new SearchPerticularUser();
		s.searchUser();
	}

}
