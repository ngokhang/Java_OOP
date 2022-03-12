package BT_Tuan3;

import java.util.Scanner;

public class Main {

  public static void chooseOption() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Linked List implements : 1");
    System.out.println("Array implements : 2\n");
    System.out.println("Your choice : ");
    int option = sc.nextInt();
    switch (option) {
      case 1:
        linkedListStack stackLL = new linkedListStack();
        stackLL.test();
        System.out.println();
        stackLL.bieuThucToanHoc("x^2+y^2");
        break;

      case 2:
        arrayStack st = new arrayStack();
        st.display();
        break;

      default:
        System.out.println("Invalid option");
        break;
    }
    sc.close();
  }

  public static void main(String[] args) {
    Point test = new Point();
    test.display();
    chooseOption();

  }
}