package string.java;
import java.util.Scanner;

public class FindTheCoumtOfPerticularCharWithoutUsingLoopAndCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter given charater: ");
		char c1 = sc.next().charAt(0);
		long count=str.chars().filter(sr -> sr == c1).count();
		System.out.println(c1+" charater count is: "+count);
		
	}

}
