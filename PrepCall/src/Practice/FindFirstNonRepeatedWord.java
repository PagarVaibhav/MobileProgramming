package Practice;

import java.util.LinkedHashSet;

public class FindFirstNonRepeatedWord {

	public static void main(String[] args) {
		
		String str="Java Hungry Blog Alive is Awesome";
		
		String str1=str.toLowerCase();
		
		LinkedHashSet set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			set.add(str1.charAt(i));
		}
		System.out.println(set);

		set.stream().findFirst().ifPresent(System.out::println);
	}
}
