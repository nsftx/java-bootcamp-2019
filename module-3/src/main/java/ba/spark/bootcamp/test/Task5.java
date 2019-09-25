package ba.spark.bootcamp.test;

public class Task5 {
    public static void main(String[] args) {

        int[] a = {12, 15, 5, 6, 22, 55, 13, 4};
        int[] b = {4, 14, 13, 22, 1, 7, 5, 11};
        int[] c = new int[4];
        int j = 0;

        for (int element1 : a) {
            for (int element2 : b) {
                if (element1 == element2) {
                    c[j] = element1;
                    j++;
                }
            }
        }

        for (int element3 : c) {
            System.out.print(element3 + " ");
        }


    }
}
