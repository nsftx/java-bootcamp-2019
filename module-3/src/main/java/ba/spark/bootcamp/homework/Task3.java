package ba.spark.bootcamp.homework;

public class Task3 {
    public static void main(String[] args) {
        int[] niz = new int[15];
        int j = 0;

        for (int i = 250; i >= 1; i--) {
            if (i % 7 == 0 && i % 3 == 0) {
                niz[j] = i;
                j++;
            }
        }

        System.out.println("Brojeva od 1 do 150 koji su djeljivi s 3 i 7 ima: " + j);

        for (int z = 0; z < niz.length; z++) {
            System.out.println("Elementi niza su: " + niz[z]);
        }
    }
}
