package SimplePractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		
		String str=sc.next();
		String rev ="";
		String  orgStr=str;
		int len=str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		if(orgStr.equals(rev)) {
			System.out.println("String Is Palindrome : " +rev);
		}else {
			System.out.println("String Is Not Palindrome");
		}
	}
}
