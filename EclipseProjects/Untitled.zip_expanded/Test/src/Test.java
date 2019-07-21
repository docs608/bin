
public class Test {

	Node head;
	
	private class Node {
		int val;
		Node next;
	}
	
	public void printReverse(Node node) {
		if (node == null) {
			return;
		}
		
		printReverse(node.next);
		
		System.out.print(node.val + " ");
		
	}
	
}
