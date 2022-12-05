package Prepcall;

import java.util.Arrays;

public class Prep17 {

//  From an array, find out the elements, and their repetition and print as element=count.
//  eg.
//  input Array: [2,1,3,4,6,5,4,7,5,6,8,2,3,6,2,6,4,4,7,3,4,5,6]
//  output:
//  2=3
//  1=1
//  3=3
//  4=5
//  6=5
//  5=5
//  7=2
//  8=1

	public static void main(String[] args) {

		int arr1[] = new int[] { 2, 1, 3, 4, 6, 5, 4, 7, 5, 6, 8, 2, 3, 6, 2, 6, 4, 4, 7, 3, 4, 5, 6 };
		Arrays.sort(arr1);

		for (int i = 0; i < arr1.length; i++) {

			int count = 1;
			for (int j = i + 1; j < arr1.length; j++) {

				if (arr1[i] == arr1[j]) {

					count++;

				}

			}
			System.out.println(arr1[i] + "=" + count);

			i += (count - 1);
		}
	}
}
