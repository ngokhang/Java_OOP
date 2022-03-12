/**
 * bài 1 :
 * Viết chương trình nhập vào một dãy số nguyên từ dang sô dòng lệnh; hiển thị
 * và sắp xếp dãy số đó.
 */
package BT_Tuan1;

import java.util.Scanner;

public class bai1 {

  public static int[] setArray(int length) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[length];

    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }

    sc.close();
    return arr;
  }

  public static void printArray(int[] array) {
    System.out.println("Mang\n");
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void sortArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] <= array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();

    int[] array = setArray(length);

    printArray(array);
    sortArray(array);
    printArray(array);
    sc.close();
  }
}
