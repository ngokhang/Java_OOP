package stack;

public class Main {
	public static void main(String[] args) {
		System.out.println("Muc 2");
		StackFromArray s = new StackFromArray(5);
		for (int i = 0; i < 5; i++) {
			s.push(i);
		}
		
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.pop() + " ");
		}
		
		
		System.out.println("\nMuc 3");
		LinkedList ll = new LinkedList();
		int a[] = {1, 2, 3, 4, 5};
		int b[] = new int[a.length];
		
		System.out.println("Mang ban dau");
		for (int x : a) {
			ll.push(x);
			System.out.print(x + " ");
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = ll.pop();
		}
		System.out.println("Mang sau khi dao");
		for (int x : b) {
			System.out.print(x + " ");
		}
	}
}
