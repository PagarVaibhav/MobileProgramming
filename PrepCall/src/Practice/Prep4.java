package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a program to sort ArrayList using Comparable and Comparator?
public class Prep4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(50);
		
		System.out.println("Before The Sorting : " +al);
		
		Collections.sort(al);
		System.out.println("Sort By using Comparable : " +al);
		
		Collections.sort(al, new MyComparator());
		System.out.println("Sort By Comparator :" +al);
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