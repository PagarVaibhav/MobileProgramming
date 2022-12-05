package Prepcall;
//Print the square of diagonal elements from reverse,
//eg1,
//[[1,2,3], [4,5,6], [7,8,9]]
//Output
//81
//25   
//1
public class Prep15 {

	public static void main(String[] args) {
        int a[][]= {{1,2,3}, 
        		    {4,5,6},
        		    {7,8,9}};
        
        
        String str="";
       // String str1="";
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]) {
                    str=(a[i][j]*a[i][j])+","+str;
                }
//                if(i+j==2) {
//                    str1=(a[i][j]*a[i][j])+","+str1;
//                }
            }
        }
        System.out.println(str);
      //  System.out.println(str1);
    }
}
