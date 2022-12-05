package Prepcall;

import java.util.Arrays;
import java.util.List;

public class Prep13 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(-3 , 1,0,4,6,8);
		
		int aaa=l.stream().reduce(0 ,(a , b) ->  a+b);
		System.out.println("Addition  : " +aaa);
	}
}
