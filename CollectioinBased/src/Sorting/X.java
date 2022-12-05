package Sorting;

public class X {

	public static void main(String[] args) {
		A a=new B();
		a.doWork();
	}
}
 
class A{
	public A() {
		System.out.println("C A");
	}
	static {
		System.out.println(" S A");
	}
	protected void doWork() {
		System.out.println("DW");
	}
}

class B extends A {
	public B() {
		System.out.println("C B");
	}
	static {
		System.out.println(" S B");
	}
	protected void doWork() {
		System.out.println("DW B");

	}
}