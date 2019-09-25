package ba.spark.bootcamp.test;

public class Task2 {
    public static void main(String[] args) {
        int[] niz = {6, 5, 4, 12, 23, 58, 28, 66, 32, 15, 55, 63, 22, 55, 42, 48};

        double suma = 0;
        double brojac = 0;
        for (int element : niz) {
            if (element % 5 == 3 && element % 4 == 0) {
                suma += element;
                brojac++;
                System.out.println(element);
            }
        }

        System.out.println(" Prosjecna vrijednost im je: " + suma / brojac);


    }
}
