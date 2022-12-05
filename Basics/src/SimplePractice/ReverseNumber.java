package SimplePractice;

import java.util.Scanner;

public class ReverseNumber {

	// Reverse A number By Using While Loop
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	// Reverse A number By Using StringBuffer

	StringBuffer sb=new StringBuffer();
	
}
