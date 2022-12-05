package Prepcall;

import java.util.Arrays;
import java.util.List;

public class Prep04 {
//Given the list of integers, find the first element of the list using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,20,30,40,50);
		
		l.stream().findFirst().ifPresent(System.out::println);
	}
}
