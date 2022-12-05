package Assignment3;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ImplementsCollectors {
    
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Vaibhav");
        al.add("Deepak");
        al.add("Vicky");
        al.add("Vinod");
        al.add("Shiv");
        
        Map<String,Integer> collect = al.stream()
        		.collect( Collectors.toMap(Function.identity(), String::length));
        System.out.println(collect);
    }
    

}
