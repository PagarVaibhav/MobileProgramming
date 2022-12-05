package Prepcall;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// Sort list in increasing order by stream function
public class Prep18 {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add("Vaibhav Pagar");
		l.add("Mangesh Chawhan");
		l.add("Shivaji Borde");
		l.add("Akshay Vibhute");
		l.add("Deepak Shirale");
		
		Comparator<String> c= (s1,s2) -> {
			
			int l1=s1.length();
			int l2=s2.length();
			if(l1>l2) return 1;
			else if(l1<l2) return -1;
			else return s1.compareTo(s2);
		};
		
		List<String> list = l.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(list);
		
	}
}
