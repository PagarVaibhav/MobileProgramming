package Sorting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashmapSortByKey {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(22, "Java");
		hm.put(11, "Python");
		hm.put(33, "C++");
		hm.put(55, "Exel");
		hm.put(44, "Testing");
		
//	    System.out.println("Before Sorting");
//		
//		Set<Integer> keySet = hm.keySet();
//		
//		Iterator<Integer> itr = keySet.iterator();
//		while(itr.hasNext()) {
//			Integer i=(Integer)itr.next();
//			System.out.println(i    + "  " +  hm.get(i));
//		}
//		
//		Map<Integer, String> map=new HashMap<Integer, String>();  
//		
//		System.out.println("After Sorting");  
		
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);
		
		Set<Integer> keySet2 = tm.keySet();
		
		Iterator<Integer> itr2 = keySet2.iterator();
		while(itr2.hasNext()) {
			Integer i2=(Integer)itr2.next();
			System.out.println(i2  + "  " +  hm.get(i2));
		}
	}
}
