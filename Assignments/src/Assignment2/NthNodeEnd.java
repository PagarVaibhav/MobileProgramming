package Assignment2;

import java.util.Stack;

public class NthNodeEnd {
	public int findNthFromEnd(FindThirdNode h, int n) {
		Stack<Integer> stk = new Stack<Integer>();
		FindThirdNode ptr = h;
		while (ptr != null) {
			stk.push(ptr.value);
			ptr = ptr.nxt;
		}
		int val = 0;
		while (n != 0) {
			val = stk.peek();
			stk.pop();
			n = n - 1;
		}
		return val;
	}
 
	public static void main(String[] argvs) {

		NthNodeEnd obj = new NthNodeEnd();
		int n = 3;
		FindThirdNode h = new FindThirdNode(0);

		h.nxt = new FindThirdNode(1000);
		h.nxt.nxt = new FindThirdNode(2000);
		h.nxt.nxt.nxt = new FindThirdNode(3000);
		h.nxt.nxt.nxt.nxt = new FindThirdNode(4000);
		h.nxt.nxt.nxt.nxt.nxt = new FindThirdNode(5000);
		
		int ans = obj.findNthFromEnd(h, n);
		System.out.println("Following Linked List Is : ");
		while (h != null) {
			System.out.print(h.value + " ");
			h = h.nxt;
		}
		System.out.println();
		System.out.println("The " + n + "nd node from the end is: " + ans);

	}
}
