package string.java;

import java.util.Arrays;
import java.util.Scanner;

public class UpperLowerCaseMeyhodAndCharDtatypeUsingString {
	public void upperCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String to convert toUpperCase: ");
		String str= sc.next();
		str=str.toUpperCase();
		System.out.println("Given str obj(String constan pool) in upper case: "+str);
	}
	public void lowerCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String to convert toLowerCase: ");
		String str= sc.next();
		str =str.toLowerCase();
		System.out.println("Given str obj(String constan pool) in lower case: "+str);
	}
	public void checkIndexWisePosition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str= sc.next();
		System.out.println("Enter given charater index: ");
		int i= sc.nextInt();
		char ch = str.charAt(i);
		System.out.println("\nGiven charater index is "+i+"th And positon is:"+ch);
	}
	public static void len(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println("Length in given string : "+str.length());

		//length() : it return length of given string 
	}
	public static void indOf(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println("Enter Character for getting index : ");  // H
				
	    char c = sc.next().charAt(0); // hello
		
		// it gives first index of perticular character 
		
		System.out.println("first index of given charater  : "+str.indexOf(c));
	}
	  
	public static void lastindOf(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println("Enter Character for getting index : ");
		char c = sc.next().charAt(0);
		
		// it gives last index of perticular character 
		
		
		System.out.println("last index of given charater  : "+str.lastIndexOf(c));
		
		
	}
	public static void strconcat(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str = sc.next(); // Hello  java
		
		System.out.println("Enter String 2: ");
		String str2 = sc.next();
		
		
		String str3 = str.concat(str2);
		System.out.println("Concated string : "+str3);
	}
	// /hello  
	public static void strtrim(){
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String 1: ");
//		String str = sc.nextLine();//  Hello    
		
		
		String str = "Hello "; //   Hello  Java
		String str2 = "Hello";
		System.out.println(" string before trim : "+str+"Java");
		
		String s = str.trim(); //HelloJava
		System.out.println(" string after trim :"+s+"Java");
	
	}
	public static void isContain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello  
		System.out.println("Enter String 2: ");
		String str2 = sc.nextLine();//  Hello  
		if(str1.contains(str2)) {
			System.out.println(str2+" is present in "+str1);
		}
		else {
			System.out.println(str2+" is not present in "+str1);
		}
	}
	public static void isEquals() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello  
		System.out.println("Enter String 2: ");
		String str2 = sc.nextLine();//  Hello  
		if(str1.equals(str2)== true) {
			System.out.println(str2+" is equal to "+str1);
		}
		else {
			System.out.println(str2+" is not equal to "+str1);
		}
	}
	public static void eqaulEqual() {
		String str1 ="Ram";//  Hello  
		String str2 = "Ram";//  Hello  
		if(str1==str2) {
			System.out.println(str2+" is equal to "+str1);
		}
		else {
			System.out.println(str2+" is not equal to "+str1);
		}
	}
	public static void compareTo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello  
		System.out.println("Enter String 2: ");
		String str2 = sc.nextLine();//  Hello  
		if(str1.compareTo(str2)>0) {
			System.out.println(str2+" is equal to "+str1);
		}
		else {
			System.out.println(str2+" is not equal to "+str1);
		}
	}
	public static void ignoreCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello  
		System.out.println("Enter String 2: ");
		String str2 = sc.nextLine();//  Hello  
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println(str1+" is equal to "+str2);
		}
		else {
			System.out.println(str1+" is not equal to"+str2);
		}
	}
	public static void toCharArryToString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello  
		char ch[]=str1.toCharArray();
		
		System.out.println("Given string charater converted into charArray: ");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]+" ");
		}
	}
	public static void subString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello 
		System.out.println("Enter first index: ");
		int f = sc.nextInt();
		System.out.println("Enter last index: ");
		int l = sc.nextInt();
		System.out.println("Skip given index and continue rest of index: "+str1.substring(f));
		System.out.println("Skip first index and continue rest of index upto last given index: "+str1.substring(f,l));
	}
	public static void splitResex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello 
		String ar[]=str1.split("a");
		System.out.println(Arrays.toString(ar));
		}
	public static void replace() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();//  Hello 
		String ar = str1.replace("java","C#");
		System.out.println("After replacing the string: "+ar);
		}
	public static void intern() {
		Scanner sc = new Scanner(System.in);
		String s1 = new String("java");
		String s2 = new String("java");
		String s3=s1.intern();
		String s4 = s2.intern();
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		//System.out.println(s3==s4);
	}
	public static void main(String[] args) {
		String str="java programming";
		Scanner sc = new Scanner(System.in);
		UpperLowerCaseMeyhodAndCharDtatypeUsingString u = new UpperLowerCaseMeyhodAndCharDtatypeUsingString();
		int j=1;
		do {
			System.out.println("Enter given choice\n1.UpperCase Method:\n2.LowerCase:\n3.CheckIndexWiesePosition\n4.Find string length\n5.indexOffirst element or repeting element\n6.indexOfLast element or repeting element: ");
			System.out.println("7.strconcat Add two String\n8.trim\n9.Serch perticular element present in SndString element\n10.equal\n11.Equal equal to\n12.Compare to\n13. equal ignore case\n14.ArrayChar\n15.substring\n16.splitResex: ");
			System.out.println("17.replace()\n18.intern()");
			int ch=sc.nextInt();
			switch(ch){
			case 1:
				u.upperCase();
				break;
			case 2:
				u.lowerCase();
				break;
			case 3:
				u.checkIndexWisePosition();
				break;
			case 4:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.len();
				break;
			case 5:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.indOf();
				break;
			case 6:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.lastindOf();
				break;
			case 7:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.strconcat();
				break;
			case 8:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.strtrim();
				break;
			case 9:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.isContain();
				break;
			case 10:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.isEquals();
				break;
			case 11:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.eqaulEqual();
				break;
			case 12:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.compareTo();
				break;
			case 13:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.ignoreCase();
				break;
			case 14:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.toCharArryToString();
				break;
			case 15:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.subString();
				break;
			case 16:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.splitResex();
				break;
			case 17:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.replace();
				break;
			case 18:
				UpperLowerCaseMeyhodAndCharDtatypeUsingString.intern();
				break;
			default:
				System.out.println("Exited..");
				break;
			}
			System.out.println("Press 1 for continue and 0 for exit..");
			j=sc.nextInt();
		}while(j==1);
	}
}
