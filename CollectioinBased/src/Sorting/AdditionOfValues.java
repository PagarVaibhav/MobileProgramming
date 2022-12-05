package Sorting;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class AdditionOfValues {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("Akshay", 10);
		hm.put("Mangesh", 20);
		hm.put("Shiv", 30);
		
		System.out.println(hm);
		
		
		Collection<Integer> values = hm.values();
		System.out.println(values);
		Set<Entry<String,Integer>> entrySet = hm.entrySet();
		System.out.println(entrySet);
			
			Integer sum=0;
			
			for(Integer i:hm.values()) {
				sum+=i;
			}	
		System.out.println(sum);
		
		}
	}

