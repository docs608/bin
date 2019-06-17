
public class LinkedListDemo {

	public static int count(Node<Integer> head) {
		int count = 0;
		if (head == null) {
			return 0;
		}
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static int countRecursive(Node<Integer> head) {
		if (head == null) {
			return 0;
		}
		return 1 + countRecursive(head.next);
	}
	
	public static int countRecursiveTail(Node<Integer> head, int length) {
		if (head == null) {
			return length;
		}
		return countRecursiveTail(head.next, length + 1);
	}
	
	public static void printLL(Node<Integer> head) {
		if (head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLL(head.next);
	}
	
	public static void printLLReverse(Node<Integer> head) {
		if (head == null) {
			return;
		}
		printLL(head.next);
		System.out.print(head.data + " ");
	}
	
	public static Node recursiveReversive(Node head) { 
		if (head == null || head.next == null) { 
			return head;
    	}
		System.out.println("head: " + head.data);
    	Node remaining = recursiveReversive(head.next);
    	System.out.println("remaining: " + remaining.data);
    	head.next.next = head; 
    	head.next = null;
	   	return remaining;
	}

	private static Node<Integer> reversive(Node<Integer> head) {
		Node<Integer> prev = null, next = null, curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private static Node<Integer> reversiveGroup(Node<Integer> head, int groupSize) {
		Node<Integer> prev = null, next = null, curr = head;
		int count = 0;
		while (count < groupSize && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if (curr != null) {
			head.next = reversiveGroup(next, groupSize);
		}
		return prev;
	}
	
	public static void main(String[] args) {
		Node<Integer> head;
		head = new Node<Integer>(5);
		head.next = new Node<Integer>(6);
		head.next.next = new Node<Integer>(7);
		head.next.next.next = new Node<Integer>(8);
		head.next.next.next.next = new Node<Integer>(9);
		head.next.next.next.next.next = new Node<Integer>(10);
		head.next.next.next.next.next.next = new Node<Integer>(11);
//		System.out.println("length of the LinkedList: " + count(head));
//		System.out.println("length of the LinkedList: " + countRecursive(head));
//		System.out.println("length of the LinkedList: " + countRecursiveTail(head, 0));
//		printLL(head);
//		System.out.println();
//		printLLReverse(head);
//		System.out.println();
//		head = reversive(head);
//		head = recursiveReversive(head);
		head = reversiveGroup(head, 3);
		printLL(head);
		System.out.println();
	}
}
