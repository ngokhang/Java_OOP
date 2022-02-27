package BT_Tuan2;

import java.util.*;

class fibNumber {
  protected long sumFibonacci(int n) {
    if (n > 99)
      return 0;
    if (n <= 0)
      return 0;
    if (n == 1)
      return 1;
    if (n == 2)
      return 2;

    long res = 1;
    long temp = 1;
    long sum = 2;
    for (int i = 3; i <= n; i++) {
      res = res + temp;
      temp = res - temp;
      sum += res;
    }

    return sum;
  }
}

public class Bai1 {
  public static int setNum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap n : ");
    int num = sc.nextInt();
    sc.close();

    return num;
  }

  public static void main(String[] args) {
    System.out.println("Bai 1");
    fibNumber number = new fibNumber();
    int n = setNum();
    System.out.println(number.sumFibonacci(n));
  }
}
