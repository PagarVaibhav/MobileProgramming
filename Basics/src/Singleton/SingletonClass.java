package Singleton;

public class SingletonClass {

	private static SingletonClass s=null;
	
	private SingletonClass() {
		
	}
	
	private static SingletonClass getSingletonClass() {
		
		if(s==null) {
			s=new SingletonClass();
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		System.out.println(s.getSingletonClass().hashCode());
		System.out.println(s.getSingletonClass().hashCode());
		System.out.println(s.getSingletonClass().hashCode());

	}
}
