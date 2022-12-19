package Practice;

import java.util.HashMap;
import java.util.Map;

public class DemoString {
	public static void main(String []args) {
		
		
		String name="aabbcccaaaa";
		
		Map<Character,String> map=new HashMap<>();
		char[] charArray = name.toCharArray();
	
		for(int i=0;i<charArray.length;i++) {
			Character count=0;
			for(int j=i;j<charArray.length;j++) {
				
				if(charArray[i]==charArray[j]) {
					
					count++;
					charArray[j]=0;
					
				}
			}
			
			if(count>1 && charArray[i]!=0) {
				map.put(count, name);
			}
		}
		System.out.println(map);
	}

}
