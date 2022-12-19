 package SimplePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesFromArray {

	public static void main (String[]args) {
		
		int[] num = {1,2,3,5,4,8,2,4,3,5} ;
		
		for (int i=0; i<num.length ; i++) {
			
			for(int j=i+1 ; j<num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		
//		
//		List<Integer> l= Arrays.asList(1,2,3,5,4,8,2,4,3,5);
//		
//		Set<Integer> set=new HashSet<>();
//		
//		l.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	}
}
