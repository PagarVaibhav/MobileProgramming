package Prepcall;

import java.util.Arrays;
import java.util.List;

public class Prep07 {
//Given a list of integers, sort all the values present in it using Stream functions?

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,14,24,51,32,8);
		
		l.stream().sorted().forEach(System.out::println);
	} 
}
