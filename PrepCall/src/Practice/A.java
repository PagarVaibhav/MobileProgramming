package Practice;

public class A {

	 public static void main(String[] args) {
         int arr[]={10,20,30,10,20,30,50};
         for(int i=0;i<arr.length;i++){
             int count =0;
             for( int j=0;j<arr.length;j++){
                 if(arr[j]==arr[i]){
                     count++;
                 }
             }
             if(count==1){
            System.out.println(arr[i]);

         }
}
}}