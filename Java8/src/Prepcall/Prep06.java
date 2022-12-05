package Prepcall;

import java.util.Arrays;
import java.util.List;

public class Prep06 {
//Given a list of integers, find the maximum value element present in it using Stream functions?
	public static void main(String[] args) {
		
//		List<Integer> l=Arrays.asList(10,20,21,12,15,14);
//		
//		Integer maxValue = l.stream().max(Integer::compare).get();
//		System.out.println(maxValue);
		
		
		int arr []= {10,20,21,12,15,14};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
