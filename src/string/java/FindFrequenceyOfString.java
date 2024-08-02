package string.java;

import java.util.Scanner;

public class FindFrequenceyOfString {

	public void frequencyOfchar(String str) {
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='\u0000') {
				int c=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						c++;
						ch[j]='\u0000';
					}
				}
				System.out.println(ch[i]+" count: "+c);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		FindFrequenceyOfString r = new FindFrequenceyOfString();
		r.frequencyOfchar(str);
	}

}
