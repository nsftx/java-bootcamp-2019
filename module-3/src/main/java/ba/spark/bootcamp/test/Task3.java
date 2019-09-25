package ba.spark.bootcamp.test;

public class Task3 {
    public static void main(String[] args) {
        String[] a = {"danas", "petak", "kolovoz", "subota", "srijeda", "prosinac", "rujan", "dan", "utorak"};
        String min = a[0];
        String max = a[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length() < min.length()) {
                min = a[i];
                indexMin = i;
            }

            if (a[i].length() > max.length()) {
                max = a[i];
                indexMax = i;
            }
        }

        System.out.println(" Index maksimalnog elementa: " + max + " je: " + indexMax);
        System.out.println(" Index minimalnog elementa: " + min + " je: " + indexMin);
    }
}
