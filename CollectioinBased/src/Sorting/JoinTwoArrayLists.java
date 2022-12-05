package Sorting;

import java.util.ArrayList;

public class JoinTwoArrayLists {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList<>();
		al1.add(100);
		al1.add(101);
		
		ArrayList al2=new ArrayList<>();
		al2.add(100);
		al2.add(101);
		
		
		ArrayList res=new ArrayList<>();
		res.addAll(al1);
		res.addAll(al2);
		
		System.out.println(res);
	}
}
