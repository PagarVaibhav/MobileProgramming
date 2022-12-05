package Practice;

import java.util.Arrays;

//From an array, find out the elements, and their repetition and print as element=count.
//eg.
//input Array: [2,1,3,4,6,5,4,7,5,6,8,2,3,6,2,6,4,4,7,3,4,5,6]
//output:
//2=3
//1=1
//3=3
//4=5
//6=5
//5=5
//7=2
//8=1

public class RepeatationCheck {

	public static void main(String[] args) {
		
		int arr[]= {2,1,3,4,6,5,4,7,5,6,8,2,3,6,2,6,4,4,7,3,4,5,6};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i] + "=" +count);
			i+=(count-1);  
		}
	}
}
