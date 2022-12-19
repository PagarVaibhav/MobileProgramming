package Prepcall;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Find And Count the vowels in string

public class Prep23 {
	
		public static void main(String[] args) {
			
			String str="vaibhav";
			
			IntStream stream = str.chars();
			
		 Map<Character,Long> collect = stream.mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
			
		 collect.forEach((x,y)->{
	         if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
	        	 System.out.print("Vewels And Its Count = ");
	             System.out.println(x+":"+y);
	         }
	     });
		}
}
