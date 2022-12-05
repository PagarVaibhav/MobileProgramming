package Prepcall;

public class Prep20 {

	public static void main(String[] args) {
//		
//		String arr[]=new String[]{"aaa","bbb","ccc"};
//	    
//        String s=String.join("", arr);
//        System.out.println("new string =  " +s);
		
		String[] Arr1= {"sonali","how","are","you"};
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<Arr1.length;i++)
        {
            sb.append(Arr1[i]);
        }
        String str=sb.toString();
        System.out.println(str);
	}
}
