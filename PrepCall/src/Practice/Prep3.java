package Practice;
//In an array take alternative numbers and reverse them. Put it again in the place of array again
//e.g., arr = [1,2,3,4,5,6,7,8]
//newarr = [1,8,3,6,5,4,7,2]
public class Prep3 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		int n=0;
		int t=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				t++;
			}
		}
			int b[]=new int[t];
			
			for(int i=0;i<arr.length;i++) {
				if(i%2!=0) {
					b[n++]=arr[i];
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				if(i%2!=0) {
					System.out.println(" " +b[--t]);
				}else {
					System.out.println(" " +arr[i]);
				}
			}
		}
}
