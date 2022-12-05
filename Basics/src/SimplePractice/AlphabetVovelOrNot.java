package SimplePractice;

public class AlphabetVovelOrNot {
	
	public static void main (String []args) {
		
		
		String name="vaibhav";
		char[] ch = name.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ) {
			
		System.out.print("Vowels are :"+ch[i]);
		System.out.println();
		}
		else {
			System.out.print("Constraint are :"+ch[i]);
			System.out.println();
		}
			
		}
		
	}

}
