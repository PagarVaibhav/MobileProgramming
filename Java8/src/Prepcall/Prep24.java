package Prepcall;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prep24 {

	public static void main(String[] args) {
		
		String arr[]= {"apple", "bat" , "Cat" , "doll"};
		
		List<String> list = Arrays.asList(arr);
	
		List<String> list2 = list.stream().filter(p -> !p.contains("l")).collect(Collectors.toList());
		System.out.println(list2);
	}

	
}
