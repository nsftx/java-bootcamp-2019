package ba.spark.bootcamp.additionalTasks;

public class Task3 {
    public static void main(String[] args) {
        int[] niz1 = {4, 5, 12, 56, 88, 19, 25};
        int[] niz2 = {12, 122, 13, 15, 16, 14, 77};
        int[] niz3 = {1, 5, 23, 15, 49, 46, 13};

        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;

        for (int element1 : niz1) {
            if (element1 == 13) {
                break;
            } else {
                suma1 += element1;
            }
        }

        for (int element2 : niz2) {
            if (element2 == 13) {
                break;
            } else {
                suma2 += element2;
            }
        }

        for (int element3 : niz3) {
            if (element3 == 13) {
                break;
            } else {
                suma3 += element3;
            }
        }

        System.out.println(" Suma prvog niza je: " + suma1);
        System.out.println(" Suma drugog niza je: " + suma2);
        System.out.println(" Suma treceg niza je: " + suma3);

    }
}
