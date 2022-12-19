package SimplePractice;

public class CopyConstructor {

	int a;
	long b;
	
	CopyConstructor(){
		a=2000;
		b=35215;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	    CopyConstructor(CopyConstructor c){
	    	int a1=c.a;
	    	long b1=c.b;
	    	System.out.println(a1);
	    	System.out.println(b1);
	}
	    
	    public static void main(String[] args) {
			 CopyConstructor cc=new CopyConstructor();
			 System.out.println(cc.a);
			 System.out.println(cc.b);
		}
}
