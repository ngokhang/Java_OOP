package BT_Tuan3;

import java.util.Stack;

public class linkedListStack {
  private class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  Node top;

  linkedListStack() {

  }

  public boolean isEmpty() {
    return top == null;
  }

  public void push(int value) {
    Node newNode = new Node(value);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    if (isEmpty()) {
      return -1;
    }
    int value = top.value;
    top = top.next;
    return value;
  }

  public void displayLLStack() {
    Node tmp = top;
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return;
    }
    while (tmp != null) {
      System.out.print(tmp.value + " ");
      tmp = tmp.next;
    }
  }

  public void test() {
    linkedListStack stack = new linkedListStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println("Stack using LinkedList");
    stack.displayLLStack();
  }

  public void bieuThucToanHoc(String expressionString) {
    System.out.println();
    System.out.println("Phan tich phan tu cua bieu thuc toan hoc");
    String[] strArr = expressionString.split("");
    Stack<String> st = new Stack<String>();
    for (String string : strArr) {
      st.push(string);
    }

    for (int i = 0; i < expressionString.length(); i++) {
      System.out.print("Phan tu thu " + (i + 1) + ": ");
      System.out.println(st.pop());
    }
  }
}
