package SimplePractice;

import java.util.Arrays;

public class SplitArray {
	public static void main(String []args) {
		
		int []a= {4,8,6,3,2};
		
		
		
		int  max=a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]>max) {
				max=a[i];
			
		}
		System.out.println(max);
		
		
		int[] inp = { 1, 2, 3, 4, 5 };
        int n = inp.length;
 
        int[] a1 = new int[(n + 1)/2];
        int[] b = new int[n - a1.length];
 
        for (int j = 0; j < n; j++)
        {
            if (j < a1.length) {
                a1[j] = inp[j];
            }
            else {
                b[j - a1.length] = inp[j];
            }
        }
 
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b));
    }
		
	}
}
			
	
	

