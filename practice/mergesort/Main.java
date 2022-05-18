public class Main {
    public static void main(String[] args) throws Exception{
        int a[] = {1, 2, 2, 3, 6};
        int b[] = {1, 2, 3, 5, 9, 10};
        int r[] = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                r[k++] = a[i];
                i++;
            } else {
                r[k++] = b[j];
                j++;
            }
        }

        while (i < a.length) {
            r[k++] = a[i];
            i++;
        }

        while (j < b.length) {
            r[k++] = b[j];
            j++;
        }

        for (int x : r) {
            System.out.print(x + " ");
        }

    }
}