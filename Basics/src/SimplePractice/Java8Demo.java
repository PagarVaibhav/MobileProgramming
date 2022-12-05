package SimplePractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo {
	public static void main(String[] args) {
		
	List<Integer> list=Arrays.asList(10,20,30,50,40,80);
	
//	Iterator<Integer> iterator = list.iterator();
//	
//	while(iterator.hasNext()) {
//		
//		Integer next = iterator.next();
//		
//		if(next>=30) {
//			
//			System.out.println(next*next);
//		}
//	}
		
	List<Integer> list2 = list.stream().filter(num -> num >=30)
			              .map(num -> num*num).collect(Collectors.toList());
	
	System.out.println(list2);
	}

}
