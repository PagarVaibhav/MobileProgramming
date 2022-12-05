package Prepcall;

import java.util.Arrays;

public class Prep09 {
// String is Anagram or not
	public static void main(String[] args) {
		
		String str1="race";
		String str2="care";
		
//		int count=0;
//		
//		if(str1.length()==str2.length()) {
//			for(int i=0;i<str1.length();i++) {
//				for(int j=0;j<str2.length();j++) {
//					if(str1.charAt(i)==str2.charAt(j)) {
//						count++;
//					}
//				}
//			}
//			if(count==4) {
//				System.out.println("String Is Anagram");
//			}else {
//				System.out.println("String is Not Anagram");
//			}
//		}
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		boolean equals = Arrays.equals(c1, c2);
		
		if(equals) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
}
