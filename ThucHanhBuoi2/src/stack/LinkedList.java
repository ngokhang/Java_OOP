package stack;

public class LinkedList {
	private int size;
	private Node head;
	
	public LinkedList() {
		this.size = 0;
		this.head = null;
	}
	
	public LinkedList(Node node) {
		this.head = node;
		this.size++;
	}
	
	public void push(int value) {
		this.size++;
		Node newNode = new Node(value);
		newNode.setNext(head);
		head = newNode;
	}
	
	public int pop() {
		this.size--;
		int temp = head.getDataNode();
		head = head.getNext();
		return temp;
	}
	
	public int getSize() {
		return this.size;
	}
}
