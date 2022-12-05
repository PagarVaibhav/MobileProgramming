package Prepcall;

public class Prep11{

	 public static void main(String[] args) {
	        
	        String str="0s1a23g4ar5";
	        
	        String temp = "0";
	        int sum = 0;
	        
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	                if (Character.isDigit(ch))
	                temp += ch;
	            else {
	               
	                sum += Integer.parseInt(temp);
	                 temp="0";
	                
	            }
	        }
	        
	        System.out.println(sum + Integer.parseInt(temp));
		 
		 
//		 static int findSum(String s1)
//	        {
//	        String temp="0";
//	        int sum=0;
//	         
//	        for(int i=0; i<s1.length(); i++)
//	        {
//	            char charAt = s1.charAt(i);
//	            
//	            if(Character.isDigit(charAt))
//	            {
//	                temp+=charAt;
//	            }
//	            else
//	            {
//	                sum+=Integer.parseInt(temp);
//	                temp="0";
//	            }
//	            
//	        }
//	        return sum+=Integer.parseInt(temp);
//	        
//	    }
//	         public static void main(String[] args) {
//	            
//	             String s1="a2b3c4tg78";
//	             System.out.println(findSum(s1));
	        
	    }
}