package Practice;
//Input Array (1,2,3) Output Array (6,3,2)
public class AAA {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		
		int [] temp = new int[arr.length];
		
		int res=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
		while(res<arr.length) {
			int pro=1;
			
			for(int i=0;i<arr.length;i++) {
				if(1==res) {
					continue;
				}else {
					pro*=arr[i];
				}
			}
			temp[res]=pro;
			res++;
		}
		System.out.println();
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
