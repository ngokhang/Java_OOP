package BT_Tuan3;

public class arrayStack {
  private int[] array;
  private int size;
  private int topPointer = -1;

  arrayStack() {
    size = 0;
    array = new int[size];
    topPointer = -1;
  }

  arrayStack(int size) {
    this.size = size;
    array = new int[size];
    topPointer = -1;
  }

  public boolean isStackEmpty() {
    if (topPointer == -1)
      return true;
    else
      return false;
  }

  public boolean isStackFull() {
    if (topPointer == size - 1)
      return true;
    else
      return false;
  }

  public void push(int value) {
    if (isStackFull())
      return;
    else {
      topPointer++;
      array[topPointer] = value;
    }
  }

  public int pop() {
    if (isStackEmpty())
      return 0;
    else {
      int value = array[topPointer];
      topPointer--;
      return value;
    }
  }

  public void display() {
    arrayStack arrStk = new arrayStack(4);
    arrStk.push(1);
    arrStk.push(2);
    arrStk.push(3);
    arrStk.push(4);
    System.out.println("Stack implements from array");
    for (int i = 0; i < arrStk.size; i++) {
      System.out.print(arrStk.pop() + " ");
    }
  }
}