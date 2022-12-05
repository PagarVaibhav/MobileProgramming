package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayList {

	public static void main(String[] args) {
		
//		ArrayList<String> al=new ArrayList<>();
//		al.add("Volkswagen");   
//		al.add("Toyota");   
//		al.add("Porsche");   
//		al.add("Ferrari");   
//		al.add("Mercedes-Benz");   
//		al.add("Audi");   
//		al.add("Rolls-Royce");  
//		al.add("BMW"); 
//		
//		
//		System.out.println("Before Sorting : " + al);
//		Collections.sort(al);
//		System.out.println("After Sorting : " + al);
//	}
	
	ArrayList<Integer> list = new ArrayList<Integer>();  
	list.add(55);
	list.add(34);  
	list.add(98);  
	list.add(67);  
	list.add(39);  
	list.add(76);  
	list.add(81);  
//	System.out.println("Before Sorting : ");
//	for(Integer list1:list) {
//	System.out.println( list1);
//	}
//	
//	Collections.sort(list);
//	
//	System.out.println("After Sorting : ");
//	for(Integer list1:list) {
//		System.out.println( list1);
//		}
	
//	List<Integer> list2 = list.stream().filter(num -> num>40)
//			.map(num -> num*num).collect(Collectors.toList());
//	
//	System.out.println(list2);
	
	Collections.sort(list , Collections.reverseOrder());
	System.out.println(list);
}
}