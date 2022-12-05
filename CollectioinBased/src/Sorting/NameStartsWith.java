package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartsWith {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add("Shiv");
		l.add("shivendra");
		l.add("Mangesh");
		l.add("Vaibhav");
		l.add("Sagar");
		l.add("Akshay");
		
		System.out.println("Before Implementation : " +l);
		
		//By using java8
		
		List<String> list = l.stream().filter(names -> names.startsWith("S") || names.startsWith("s")).collect(Collectors.toList());
		
		System.out.println(list);
	}
}
