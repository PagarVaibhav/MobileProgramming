package Practice;

public class PrepCall2 {
//	There is an array with every element repeated twice except one. Find that element? {1, 1, 2, 2, 3, 4, 4, 5, 5}
	public static void main(String[] args) {
		
		int arr[] ={1, 1, 2, 2, 3, 4, 4, 5, 5};
		
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.println("The Element is : " + arr[i]);
			}
		}
		
	}
}
