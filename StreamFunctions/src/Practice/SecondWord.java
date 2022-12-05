package Practice;

import java.util.ArrayList;
import java.util.List;

public class SecondWord {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Shiv");
		list.add("Vaibhav");
		list.add("Deepak");
		list.add("Akshay");
		
		
		Object[] array = list.toArray();
		//list.stream().skip(1).limit(1).forEach(System.out::println);
		//list.stream().sorted().skip(3).forEach(System.out::println);
		for(int i=0;i<array.length;i++) {
	
			if(i==1) {
				System.out.println(array[i]);
			}
			
		}
		//System.out.println(list);
	}
}
