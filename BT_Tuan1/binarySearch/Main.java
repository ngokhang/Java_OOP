package BT_Tuan1.binarySearch;

import java.util.Scanner;

class BinarySearch {
  int binarySearch(int[] arr, int leftIndex, int rightIndex, int value) {
    if (rightIndex >= leftIndex) {
      int median = (leftIndex + rightIndex) / 2;

      if (arr[median] == value)
        return median;
      if (arr[median] > value)
        return binarySearch(arr, leftIndex, median - 1, value);
      if (arr[median] < value)
        return binarySearch(arr, median + 1, rightIndex, value);

    }
    return -1;
  }
}

public class Main {

  public static int setValue() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap gia tri can tim : ");
    int value = sc.nextInt();

    return value;
  }

  public static int setLengthArray() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap do dai cua mang : ");
    int lengthArray = sc.nextInt();

    return lengthArray;
  }

  public static int[] setArray(int length) {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[length];

    System.out.println("Moi nhap mang : ");

    for (int i = 0; i < length; i++) {
      array[i] = sc.nextInt();
    }

    return array;
  }

  public static void checkResult(int result, int value) {
    if (result != -1) {
      System.out.println("Value is here, index = " + result);
    } else {
      System.out.println("Value is not here");
    }
  }

  public static void main(String[] args) {
    int valueSearch = setValue();
    int length = setLengthArray();
    int[] arr = setArray(length);
    BinarySearch algo = new BinarySearch();
    int result = algo.binarySearch(arr, 0, length - 1, valueSearch);

    checkResult(result, valueSearch);

  }
}
