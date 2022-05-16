package ThucHanh16052022.bai1;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
        this.phanThuc = 0;
        this.phanAo = 0;
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }
    
    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return this.phanThuc;
    }

    public double getPhanAo() {
        return this.phanAo;
    }

    public double calcModule() {
        return Math.sqrt(getPhanThuc() * getPhanThuc() + getPhanAo() * getPhanAo());
    }

    public boolean compareNumber(SoPhuc n) {
        if ((n.getPhanAo() == this.getPhanAo()) && (n.getPhanThuc() == this.getPhanThuc())) {
            return true;
        }
        return false;
    }

    public void add(SoPhuc n) {
        System.out.println((this.getPhanThuc() + n.phanThuc) +  " + " + (this.getPhanAo() + n.getPhanAo()) + "i\n");
    }

    public void substract(SoPhuc n) {
        System.out.println((this.getPhanThuc() - n.phanThuc) +  " + " + (this.getPhanAo() - n.getPhanAo()) + "i\n");
    }

    public void multiple(SoPhuc n) {
        System.out.println( ((this.getPhanThuc() * n.phanThuc) - (this.getPhanAo() * n.getPhanAo())) + " + " + ((this.getPhanThuc() * n.phanThuc) + (this.getPhanAo() * n.getPhanAo())) + "i\n");
    }

    public void division(SoPhuc n) {
        double temp1 = (this.getPhanThuc() * n.phanThuc) + (this.getPhanAo() * n.getPhanAo());
        double temp2 = (this.getPhanThuc() * n.phanThuc) - (this.getPhanAo() * n.getPhanAo());
        double temp3 = Math.pow(n.getPhanAo(), 2) + Math.pow(n.getPhanThuc(), 2);

        System.out.println(temp1 / temp3 + " + " + temp2 / temp3 + "i\n");
    }

    public void nhanSoThuc(int a) {
        double phanThuc = this.getPhanThuc() * a;
        double phanAo = this.getPhanAo() * a;
        System.out.println(phanThuc + " + " + phanAo + "i\n");
    }

    public String soPhucLienHop() {
        if (this.getPhanAo() < 0) {
            return this.getPhanThuc() + " + " + (this.getPhanAo() * -1) +"i\n";
        }
        return this.getPhanThuc() + " - " + this.getPhanAo() +"i\n";

    }

    public String toString() {
        String temp = "";
        if (getPhanThuc() == 0) {
            temp = Double.toString(getPhanAo()) + "i\n";
        } else if (getPhanAo() == 0) {
            temp = Double.toString(getPhanThuc()) + "\n";
        } else {
            temp = Double.toString(getPhanThuc()) + " + " + Double.toString(getPhanAo()) + "i\n";
        }
        temp += "Module : " + calcModule() + "\n";
        return temp;
    }
}
