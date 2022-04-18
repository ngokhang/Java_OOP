package stack;

public class StackFromArray implements Stack{
	private int size;
	private int topPtr;
	private int[] arr;
	
	StackFromArray() {
		this.size = 0;
		this.topPtr = -1;
		arr = new int [size];
	}
	
	StackFromArray(int size) {
		this.arr = new int[size];
		this.topPtr = -1;
	}
	
	public void push(int element) {
		this.topPtr++;
		this.size++;
		arr[topPtr] = element;
	}
	
	public int end() {
		return this.arr[0];
	}
	
	public int top() {
		return this.arr[this.arr.length - 1];
	}
	
	public int size() {
		return this.size;
	}
	
	public int pop() {
		int temp = this.arr[this.topPtr];
		this.arr[this.topPtr] = 0;
		this.topPtr--;
		return temp;
	}
	
	public boolean isEmpty() {
		if (this.arr.length == 0) 
			return true;
		return false;
	}
	
}
