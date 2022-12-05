package Prepcall;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prep10 {
// Find the second Largest Number
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,20,44,66,14,45);
		
		Integer integer = l.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);
	}
}
