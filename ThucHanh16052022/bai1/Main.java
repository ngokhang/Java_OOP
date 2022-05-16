package ThucHanh16052022.bai1;

public class Main {
    public static void main(String[] args) {
        SoPhuc s1 = new SoPhuc(2, 3);
        SoPhuc s2 = new SoPhuc(5, 6);
        System.out.println(s1.toString());
        System.out.println(s1.soPhucLienHop());
        s1.multiple(s2);
        s1.add(s2);
        s1.substract(s2);
        s1.division(s2);
        System.out.println(s1.calcModule());
        
    }
}
