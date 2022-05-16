package ThucHanh16052022.bai2;

public class Main {
    public static void main(String[] args) {
        double[] a = {1,2,3,4};
        double[] b = {2, 3, 4, 5};
        Vector v = new Vector(a);
        Vector x = new Vector(b);
        System.out.println(v.toString());
        v.nhanSoThuc(5);
        v.calcLen();
        v.add(x);
        v.substract(x);
        v.nhanSoThuc(4);
        Vector vecDonVi = v.calcUnitVector();
        System.out.println(vecDonVi.toString());
        
    }
}
