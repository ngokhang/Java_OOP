package stack;

public class Node {
	private int data;
	private Node next;
	
	public Node() {
		this.data = 0;
		this.next = null;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public int getDataNode() {
		return this.data;
	}
}
