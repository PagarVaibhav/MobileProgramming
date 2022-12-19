package Practice;
//Sample input: 4 8 6 3 2
//Sample output: 4 6 2 6 3 2


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prep7 {

	public static void main(String[] args) {
		
		int [] arr= {4 ,8 ,6 ,3, 2};
		int f=0;
		int s=0;
		int temp=0;
		
		List<Integer> lis=new ArrayList<>();
		for(Integer i:arr) {
			lis.add(i);
		}
		
		System.out.println("Input Array : " +lis);
		
		Collections.sort(lis);
		f=lis.get(lis.size()-1);
		s=lis.get(lis.size()-2);
		
		temp=f-s;
		
		List<Integer> list=new LinkedList<>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(int i=0;i<list.size()-1;i++) {
			if(f==arr[i]) {
				list.remove(i);
				list.add(i , s);
				list.add(i+1 , temp);
			}
		}
		
		System.out.println("Output Array : " +list);
	}
}
