package Prepcall;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Prep03 {
	//How to find duplicate elements in a given integers list in java using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,4,10,4,1,25,45,10,100);
		
		Set<Integer> s=new HashSet<>();
		
		List<Integer> list = l.stream().filter(num -> !s.add(num)).collect(Collectors.toList());
		System.out.println(list);
	}
}
