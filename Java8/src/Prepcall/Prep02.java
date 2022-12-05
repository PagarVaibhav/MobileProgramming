package Prepcall;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prep02 {
	//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	public static void main(String[] args) {
		
//		List<Integer> l=Arrays.asList(10,21,52,104,107,212,130,100);
//		
//		
//		l.stream().map(num -> num+"").filter(num -> num.startsWith("1")).forEach(System.out::println);
		
		List<String> l=Arrays.asList("Vaibhav" , "Mangesh" , "Vicky");
		
		List<String> collect = l.stream().filter(e -> e.startsWith("V")).collect(Collectors.toList());
		System.out.println(collect);
	}
}
