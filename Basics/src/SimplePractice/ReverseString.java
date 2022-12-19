package SimplePractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string");
		
		String str=sc.nextLine();
		String rev="";
		//int len=str.length();
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
//	StringBuffer sb=new StringBuffer(str);
//	StringBuffer reverse = sb.reverse();
//	System.out.println(reverse);

}