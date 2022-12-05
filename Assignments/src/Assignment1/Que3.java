package Assignment1;
//Take an array of length n where all the numbers are nonnegative and unique. Find the element in
//the array possessing the highest value. Split the element into two parts where first part contains the
//next highest value in the array and second part hold the required additive entity to get the highest
//value. Print the array where the highest value gets splitted into those two parts.
//Sample input: 4 8 6 3 2
//Sample output: 4 6 2 6 3 2
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que3 {
   
	public static void main(String[] args) {
       
        int arr[]= {4,8,6,3,2};
        
        int temp=0;
        int first=0;
        int second=0;
        
        List<Integer> l=new ArrayList<>();
        for(Integer i:arr) {
            l.add(i);
        }
        System.out.println(l);
        
        Collections.sort(l);//2,3,4,6,8
      //  System.out.println(l);//Sort by Ascending order
        
        first=l.get(l.size()-1); //8
      // System.out.println(first);
        second=l.get(l.size()-2);//6
     //  System.out.println(second);
        
        temp=first-second;//8-6=2

        List<Integer> list =new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size()-1; i++) {
            if (first==arr[i]) {
                list.remove(i);
                
                list.add(i,second);
                list.add(i+1,temp);
            }
        }
        
        System.out.println(list);
        
    }

}