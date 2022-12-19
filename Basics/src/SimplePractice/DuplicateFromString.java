package SimplePractice;

public class DuplicateFromString {

	public static void main(String[] args) {
		
		String str="Great Apportunity";
		int count;
		
		char[] charArray = str.toCharArray();
		System.out.println("Duplicate characters in a given string: ");
		
		for(int i=0;i<charArray.length;i++) {
			count=1;
			
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i] == charArray[j] && charArray[i] != ' ' ) {
					count++;
					charArray[j]='0';
				}
			}
			if(count>1 && charArray[i]!='0') {
				System.out.println(charArray[i]);
			}
		}
	}
}
