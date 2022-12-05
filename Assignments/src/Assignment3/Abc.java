package Assignment3;

import java.util.Arrays;
import java.util.List;

public class Abc {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,35,15,40,50,55,66);

		System.out.println("How Will You Get The Lowest Number Present In A List Using Java 8 ??");
		
		Integer lowestValue = l.stream().min(Integer::compare).get();
		System.out.println("Lowest No Is : " +lowestValue);
//====================================================================================================================
		
		System.out.println("How Will You Get The Sum Of All Numbers Present In A List Using Java 8 ?");
		
		Integer sumOfAllNo = l.stream().reduce(0 ,(a , b)-> a+b);
		System.out.println("Sum Of All No Is : " +sumOfAllNo);
	}
}
