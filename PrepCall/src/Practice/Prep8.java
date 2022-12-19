package Practice;

public class Prep8 {

	public static void main(String[] args) {
		
		  String s1="United States of America";
	        String rev="";
	        String[] split = s1.split(" ");
	        
	        for(int i=0; i<split.length; i++)
	        { 
	            String word=split[i];
	            String rev1="";
	         
	        for(int j=word.length()-1; j>=0; j--)
	            
	        {
	            rev1 =rev1+word.charAt(j);
	        }
	        
	        rev=rev + rev1 +" " ;
	        }
	        System.out.println(rev);
	}
}
