package Assignment2;

public class ReversedLinkedList {

	static LinkedListNode head;

	static class LinkedListNode {

		int val;
		LinkedListNode next;

		LinkedListNode(int no) {
			val = no;
			next = null;
		}
	}

	LinkedListNode reverse(LinkedListNode node) {

		LinkedListNode previous = null;
		LinkedListNode curr = node;
		LinkedListNode next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = previous;
			previous = curr;
			curr = next;
		}
		node = previous;
		return node;
	}


	void printList(LinkedListNode nde) {
		while (nde != null) {
			System.out.print(nde.val + " ");
			nde = nde.next;
		}
	}

	public static void main(String argvs[]) {
		
		ReversedLinkedList listObj = new ReversedLinkedList();
		
		listObj.head = new LinkedListNode(10);
	
		listObj.head.next = new LinkedListNode(20);

		listObj.head.next.next = new LinkedListNode(30);

		listObj.head.next.next.next = new LinkedListNode(40);

		listObj.head.next.next.next.next = new LinkedListNode(50);

	
		System.out.println("The Linked List Before Reverse : ");
		listObj.printList(head);
		head = listObj.reverse(head);
		
		System.out.println();
		System.out.println("The Linked After Reverse : ");
		listObj.printList(head);
	}
}
