package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingOfArraylist {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(15);
		l.add(26);
		l.add(22);
		l.add(14);
		l.add(19);
	
		System.out.println("Before Sorting : " + l);
		Collections.sort(l);
		System.out.println("After Sorting :" +l);
		
		Collections.sort(l, new MyComparator());

		System.out.println("Sort By Comparator : " +l);
	}
}
 
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
	
}