package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class X {

	public static void main(String[] args) {
		
//		String str ="ababababa";
//		
//		String ele="ab";
//		
//		String[] split = str.split(ele);
//		
//		System.out.println("Count of ab is :" + (split.length - 1));
		
		String s1="ababababab";
		String s2="ab";
		int lastIndex=0;
		int count=0;
		
		while(lastIndex != -1) {
			
			lastIndex = s1.indexOf(s2, lastIndex);
			
			if(lastIndex != -1) {
				
				count++;
				lastIndex+=s2.length();
			}
		}
		System.out.println( "ab = "  +count);
		
//		String s1="vaibhav";
//		String s2="pagar";
//		
//		System.out.println(s1 + " " + s2);
//		
//		String temp=s1;
//		
//		s1=s2;
//		s2=temp;
//		
//		System.out.println(s1 + " " + s2);
		
//		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		System.out.println(asList.stream().map(num -> num*2).collect(Collectors.toList()));
		
	}
	}