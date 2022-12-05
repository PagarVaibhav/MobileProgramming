package SimplePractice;

public class Demo {
	
	public static void main (String []args) {
		
		String name="dipak";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			char ch=name.charAt(i);
			System.out.print(ch);
		}
	}
}

