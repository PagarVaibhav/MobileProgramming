package Assignment9;

import java.util.ArrayList;

public class Question1 {

	 public static void main(String[] arg) throws Exception
     {
         try {
             ArrayList<String> num = new ArrayList<String>(3);
             
             num.add("320");
             num.add("180");
             num.add("840");
   
             System.out.println("ArrayList: " + num);
   
             System.out.println("Increase the capacity of an ArrayList num to store upto 500 elements.");
   
             num.ensureCapacity(500);
   
             System.out.println("ArrayList numbers can now store upto 500 elements.");
         }
   
         catch (NullPointerException e) {
             System.out.println("Exception thrown : " + e);
         }
     }    
}
