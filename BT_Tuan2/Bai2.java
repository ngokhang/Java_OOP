package BT_Tuan2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Bai2
 * Note : Default, matrices in files is 3x3 type
 * -> If need to change matrices'size, will change para: rows, cols in function:
 * getArr, main
 * and files input
 * -> If need to change path, will change your path to file(optional)
 */
public class Bai2 {
  public static int[][] getArr(String path, int rows, int cols) throws Exception {
    Scanner sc = new Scanner(new BufferedReader(new FileReader(path)));
    int[][] mt = new int[rows][cols];

    while (sc.hasNextLine()) {
      for (int i = 0; i < mt.length; i++) {
        String[] line = sc.nextLine().trim().split(" ");
        for (int j = 0; j < line.length; j++) {
          mt[i][j] = Integer.parseInt(line[j]);
        }
      }
    }

    return mt;
  }

  public static void display(int[][] arr, int rows, int cols) {
    System.out.println("Mang");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void addTwoMatriecs(int[][] arr1, int[][] arr2, int rows, int cols) {
    int[][] resArr = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        resArr[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    display(resArr, rows, cols);
  }

  public static void transform(int[][] arr, int rows, int cols) {
    int[][] transArr = new int[cols][rows];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        transArr[j][i] = arr[i][j];
      }
    }
    display(transArr, rows, cols);
  }

  public static void getSize(String path, int rows, int cols) throws Exception {
    Scanner sc = new Scanner(new BufferedReader(new FileReader(path)));
    int[][] mt = new int[rows][cols];
    int row = 0;
    int col = 0;
    int sum = 0;

    while (sc.hasNextLine()) {
      for (int i = 0; i < mt.length; i++) {
        String[] line = sc.nextLine().trim().split(" ");
        row++;
        for (int j = 0; j < line.length; j++) {
          mt[i][j] = Integer.parseInt(line[j]);
          sum++;
        }
      }
    }
    col = sum / row;
    String size = Integer.toString(row) + "x" + Integer.toString(col);

    System.out.println(size);
  }

  public static void main(String[] args) throws Exception {
    int rows = 3;
    int cols = 3;
    int[][] arr1 = new int[rows][cols];
    arr1 = getArr("./BT_Tuan2/INP1.txt", rows, cols);
    int[][] arr2 = new int[rows][cols];
    arr2 = getArr("./BT_Tuan2/INP2.txt", rows, cols);

    // System.out.println("Hai ma tran");
    // display(arr1, rows, cols);
    // System.out.println();
    // display(arr2, rows, cols);

    System.out.println("Tong cua hai ma tran");
    addTwoMatriecs(arr1, arr2, rows, cols);

    System.out.println("Ma tran nghich dao cua ma tran 1");
    transform(arr1, rows, cols);
    System.out.println("Ma tran nghich dao cua ma tran 2");
    transform(arr2, rows, cols);

    getSize("./BT_Tuan2/INP1.txt", rows, cols);
  }
}