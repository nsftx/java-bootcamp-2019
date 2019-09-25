package ba.spark.bootcamp.test;

public class Task4 {
    public static void main(String[] args) {
        int[] a = {4, 15, 256, 17, 14, 5, 262};
        int[] b = {7, 12, 5, 16, 25, 19, 17};
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                c[i] = a[i] + b[i];
            } else {
                c[i] = a[i] - b[i];
            }
        }

        for (int element : c) {
            System.out.print(element + " ");
        }
    }
}
