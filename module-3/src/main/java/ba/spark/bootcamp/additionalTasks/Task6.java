package ba.spark.bootcamp.additionalTasks;

public class Task6 {
    public static void main(String[] args) {
        int[] niz1 = {11, 2, 3, 4, 5};
        int[] niz2 = {82, 64, 7, 5, 3, 10, 29};
        int[] niz3 = {1, 2, 3};
        int[] middle1 = new int[3];
        int[] middle2 = new int[3];
        int[] middle3 = new int[3];

        int sredina1 = niz1.length / 2;
        int sredina2 = niz2.length / 2;
        int sredina3 = niz3.length / 2;

        int index = 0;

        for (int i = 0; i < 3; i++) {
            index = sredina1 - 1 + i;
            middle1[i] = niz1[index];
        }

        for (int element1 : middle1) {
            System.out.print(element1 + " ");
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            index = sredina2 - 1 + i;
            middle2[i] = niz2[index];
        }

        for (int element2 : middle2) {
            System.out.print(element2 + " ");
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            index = sredina3 - 1 + i;
            middle3[i] = niz3[index];
        }

        for (int element3 : middle3) {
            System.out.print(element3 + " ");
        }

    }
}
