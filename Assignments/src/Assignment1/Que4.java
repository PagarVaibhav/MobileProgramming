package Assignment1;

import java.util.Arrays;

//WAP to remove a specific digit from every element of the list
//Input=[333,893,1948,34,2346], K=3
//Output=[,89,1948,4,246]
public class Que4 {

	public static void main(String[] args) {
		
		int arr[]= {333,893,1948,34,2346};

		String string = Arrays.toString(arr);
		
		String replacedString = string.replace("3", "");
		
		System.out.println(replacedString);
		
	}
}
