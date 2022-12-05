package Assignment4;

public class NestedTryWithMultiCatch {
	public static void main(String args[]) {
		// Main Outer Try Block
		try {
			// Nested 1st Try Block
			try {
				System.out.println("Expression To Divide By Zero");
				int x = 450/0;
			}
			// 1st Catch Block
			catch (ArithmeticException e) {
				e.printStackTrace();
			}

			// 2nd Nested Try Block
			try {
				int a[] = new int[10];
				// Assign Out Of Bound Value
				a[10] = 8;
			}

			// 2nd Catch Block
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		// Main Catch Block
		catch (Exception e) {
			System.out.println("Handelled The Exceptions");
		}

		System.out.println("Normal Termination Of Programe");
	}
}
