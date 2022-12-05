package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//How to find duplicate elements in a given integers list in java using Stream functions?
//(10,15,8,49,25,98,98,32,15)
public class FindDuplicatesByStram {

	public static void main(String[] args) {
		
		int arr[]= {10,15,8,49,25,98,98,32,15};
		
		List<Integer> l=Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Set<Integer> s=new HashSet<>();
		
		l.stream().filter(num -> !s.add(num)).forEach(System.out::println);
	}
}
