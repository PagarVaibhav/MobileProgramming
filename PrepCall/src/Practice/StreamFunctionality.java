package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamFunctionality {

	public static void main(String[] args) {
		
	
	List<Integer> l=Arrays.asList(100 ,200 ,300, 400 ,500);
	
	Integer findFist = l.stream().sorted(Collections.reverseOrder()).findFirst().get();
	System.out.println(findFist);
	
	
	Integer findAny = l.stream().findAny().get();
	System.out.println(findAny);
	
	}
}
