package Prepcall;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prep01 {

	//Given a list of integers, find out all the even numbers exist in the list using Stream functions?

	public static void main(String[] args) {
		
//		List<Integer> l=Arrays.asList(10,20,12,15,25,8,64);
//		List<Integer> collect = l.stream().filter(num -> num%2==0).collect(Collectors.toList());
//		System.out.println(collect);
		
		int arr[]= {10,20,12,15,25,8,64};
		
		for (int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			
			}
		}
	}
}
