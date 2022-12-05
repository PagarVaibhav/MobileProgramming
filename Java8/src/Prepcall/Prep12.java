package Prepcall;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Prep12 {
// Find the largest string by using stream function
	public static void main(String[] args) {
		
		List<String>  l=Arrays.asList("Vaibhav" ,"Akshay" ,"Mangesh" ,"Shiv" ,"Virat" ,"MobileProgramming" );
		
		Optional<String> largestWord = l.stream().reduce((w1 ,w2) -> w1.length() > w2.length() ? w1:w2);
		
		largestWord.ifPresent(System.out::println);
	}
}
