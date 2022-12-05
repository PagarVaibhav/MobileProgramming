package SimplePractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		
		int num=sc.nextInt();
		int rev=0;
		int orgNo=num;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num=num/10;
		}
		
		if(orgNo==rev) {
			System.out.println("No Is Palindrome : " + rev);
		}else {
			System.out.println("No Is Not Palindrome : " +rev);
		}
	}
}
