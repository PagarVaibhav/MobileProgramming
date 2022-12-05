package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prep2 {

	// You Have Two List Of Strings, Concat Them Using Stream API
	
	public static void main(String[] args) {
		
		List<Object> l1=new ArrayList<>();
		l1.add("abc");
		l1.add("Software");
		
		List<Object> l2=new ArrayList<>();
		l1.add("xyz");
		l1.add("Company");
		
		Stream<Object> str1 = l1.stream();
		Stream<Object> str2 = l2.stream();
		
		List<Object> list = Stream.concat(str1, str2).collect(Collectors.toList());
		System.out.println(list);
	}
}
