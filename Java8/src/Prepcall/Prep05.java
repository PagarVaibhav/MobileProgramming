package Prepcall;

import java.util.Arrays;
import java.util.List;

public class Prep05 {
//Given a list of integers, find the total number of elements present in the list using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,20,24,10,25,62,50,62);
		
		long count = l.stream().count();
		
		System.out.println(count);
	}
}
