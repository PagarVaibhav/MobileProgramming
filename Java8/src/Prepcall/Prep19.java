package Prepcall;

public class Prep19 {

	public static void main(String[] args) {
		
		String str="My Name Is Vaibhav";
		
		String  arr[] =str.split(" ");
        String high="";
        int num=0;
    
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>num){
                num =arr[i].length();
                high=arr[i];  
            }
            
        }
        System.out.println(high);
	}
}
