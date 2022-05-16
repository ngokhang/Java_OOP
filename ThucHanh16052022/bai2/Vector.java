package ThucHanh16052022.bai2;

public class Vector {
    private int soChieu;
    private double[] array;

    public Vector() {
        soChieu = 0;
        array = new double[soChieu];
    }

    public Vector(int soChieu) {
        this.soChieu = soChieu;
        array = new double[soChieu];
    }

    public Vector(double[] a) {
        this.soChieu = a.length;
        array = a;
    }

    public int getLength() {
        return array.length;
    }

    public double[] add(Vector x) {
        if(x.getLength() < array.length) {
            return array;
        }
        for(int i = 0; i < array.length; i++) {
            array[i] += x.array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public double[] substract(Vector x) {
        if(x.getLength() < array.length) {
            return array;
        }
        for(int i = 0; i < array.length; i++) {
            array[i] -= x.array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public double calcLen() {
        double sum = 0;
        for (double d : array) {
            sum += Math.pow(d, 2);
        }
        System.out.println(Math.sqrt(sum));
        return Math.sqrt(sum);
    }

    public double[] nhanSoThuc(double x) {
        for (double d : array) {
            d = d * x;
            System.out.print(d + " ");
        }
        System.out.println();
        return array;
    }

    public void print() {
        for (double d : array) {
            System.out.println(d);
        }
    }

    public Vector calcUnitVector() {
        double[] temp = new double[soChieu];
        double temp2 = 0;
        for (double d : array) {
            temp2 += (d * d);
        }
        temp2 = Math.sqrt(temp2);
        int i = 0;
        for (double d : array) {
            temp[i] = d / temp2;
            System.out.print(temp[i] + " ");
            i++;
        }
        
        Vector vDonVi = new Vector(temp);
        return vDonVi;
    }

    public String toString() {
        String temp = "\n(";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                temp += array[i] + ")\n";
                return temp;
            }
            temp += Double.toString(array[i]) + ", ";
        }
        return temp;
    }
}
