package Prepcall;
//Given an unsorted array a = [3,1,5,2,7], find alternate elements "3,5,7", reverse them "7,5,3" and place them in the original array
//Expected result [7,1,5,2,3]

public class Prep21 {

	public static void main(String[] args) {
		
		 int[] a = {3,1,5,2,7};
	        
	        int c=0;
	        for(int i=0;i<a.length; i++)
	        {
	            if(i%2==0 || i==0)
	            {
	                c++;
	            }
	        }
	        System.out.println(c);
	        
	        int b[]=new int[c];
	        int n=0;
	        for(int i=0 ; i<a.length; i++)
	        {
	            if(i%2==0 || i==0)
	            {
	                b[n++]=a[i];
	            }
	        }
	        
	        for(int i=0; i<a.length; i++)
	            if(i%2==0 || i==0)
	            {
	                System.out.print(b[--c]+",");
	            }
	            else
	            {
	                System.out.print(a[i]+",");
	            }
	}
}
