package Practice;

//Write a program to find all pairs in array of integers whose sum is equal
//* to the given number Given array : [2, 4, 3, 5, 6, -2, 4, 7, 8, 9] Given sum :
//* 7 Integer numbers, whose sum is equal to value : 7 (2, 5) (4, 3) (3, 4) (-2,
//* 9)
public class AdditionArray {

	public static void main(String[] args) {
		
		int arr[] = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		
		for(int i=0; i<=arr.length; i++) {
			
			for(int j=i+1; j<=arr.length-1;j++) {
				
				if(arr[i]+arr[j]==7) {
					
					System.out.println(arr[i] + "   "+ arr[j]);
				}
			}
		}
	}
}
