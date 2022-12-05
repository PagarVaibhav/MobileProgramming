package Practice;

public class ReverseArrayFromGivenIndex {

	public static void main(String[] args) {
		
		int arr[]= {21,54,11,35,4,18};
		
		int n=4;
		
		System.out.println("ORG Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0; i<n; i++) {
			int j , temp;
			temp=arr[0];
			
			for(j=0; j<arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		
		
		System.out.println();
		
		System.out.println("Rotate array from given index: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
