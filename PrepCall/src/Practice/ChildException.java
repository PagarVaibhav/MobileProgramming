package Practice;

public class ChildException extends ParentException{
	
	public void runMethod() throws RuntimeException{
		
		int a=20;
		int b=0;
		
		int c=a/b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		ChildException ch=new ChildException();
		ch.nullMethod();
        ch.runMethod();
	}
}
