package Practice;
//
public class Prep5 {

	public static void main(String[] args) {
		
		String arr[] = {"Vaibhav" , "Harishchandra" , "Pagar"};
		
		StringBuffer sb=new StringBuffer();
      
		for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        String joinedArray=sb.toString();
        
        System.out.println(joinedArray);
	}
}
