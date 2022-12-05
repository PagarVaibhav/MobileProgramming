package Prepcall;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prep08 {
// Given a list of integers, sort all the values present in it in descending order using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,14,24,51,32,8);
		
		l.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}
