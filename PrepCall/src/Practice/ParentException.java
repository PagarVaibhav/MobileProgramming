package Practice;

public class ParentException {

	public void nullMethod() throws NullPointerException{
		
		String s= null;
		
		System.out.println(s.toUpperCase());
	}
}
