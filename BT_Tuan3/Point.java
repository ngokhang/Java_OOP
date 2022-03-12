package BT_Tuan3;

import java.util.Scanner;

public class Point {
  private double x;
  private double y;

  public Point() {
    x = 0;
    y = 0;
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point a) {
    this.x = a.x;
    this.y = a.y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTwoPoints(Point a, Point b) {
    return (Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y)));
  }

  public int checkPoints(Point a, Point b, Point c) {
    double ab = distanceTwoPoints(a, b);
    double bc = distanceTwoPoints(b, c);
    double ac = distanceTwoPoints(a, c);
    if (((ab + bc) > ac) && ((bc + ac) > ab) && ((ac + ab) > bc)) {
      return 1; // khong thang hang
    }
    return 0; // thang hang
  }

  public double calcPerimeter(Point a, Point b, Point c) {
    double ab = distanceTwoPoints(a, b);
    double bc = distanceTwoPoints(b, c);
    double ac = distanceTwoPoints(a, c);

    return ab + bc + ac;
  }

  public double calcArea(Point a, Point b, Point c) {

    double ab = distanceTwoPoints(a, b);
    double bc = distanceTwoPoints(b, c);
    double ac = distanceTwoPoints(a, c);
    double perimeter = calcPerimeter(a, b, c);

    return Math.sqrt(perimeter * (perimeter - ab) * (perimeter - bc) * (perimeter - ac));
  }

  public void display() {
    Scanner sc = new Scanner(System.in);
    Point a = new Point();
    Point b = new Point();
    Point c = new Point();

    System.out.println("Nhap toa do cho diem a");
    System.out.print("X(a): ");
    double valueX_a = sc.nextDouble();
    a.setX(valueX_a);

    System.out.print("Y(a): ");
    double valueY_a = sc.nextDouble();
    a.setY(valueY_a);

    System.out.println("Nhap toa do cho diem b");
    System.out.print("X(b): ");
    double valueX_b = sc.nextDouble();
    b.setX(valueX_b);

    System.out.print("Y(b): ");
    double valueY_b = sc.nextDouble();
    b.setY(valueY_b);

    System.out.println("Nhap toa do cho diem c");
    System.out.print("X(c): ");
    double valueX_c = sc.nextDouble();
    c.setX(valueX_c);

    System.out.print("Y(c): ");
    double valueY_c = sc.nextDouble();
    c.setY(valueY_c);

    if (checkPoints(a, b, c) == 0) {
      System.out.println("Ba diem a b c thang hang");
      System.out.println("Khoang cach giua hai diem a b = " + distanceTwoPoints(a, b));
      System.out.println("Khoang cach giua hai diem a c = " + distanceTwoPoints(a, c));
      System.out.println("Khoang cach giua hai diem b c = " + distanceTwoPoints(b, c));
      return;
    } else if (checkPoints(a, b, c) == 1) {
      System.out.println("Ba diem a b c khong thang hang");
      System.out.println("Khoang cach giua hai diem a b = " + distanceTwoPoints(a, b));
      System.out.println("Khoang cach giua hai diem a c = " + distanceTwoPoints(a, c));
      System.out.println("Khoang cach giua hai diem b c = " + distanceTwoPoints(b, c));
      System.out.println("Chu vi cua tam giac = " + calcPerimeter(a, b, c));
      System.out.println("Dien tich cua tam giac  = " + calcArea(a, b, c));
      System.out.println(checkPoints(a, b, c));
      return;
    }
  }
}