package ba.spark.bootcamp;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] niz1 = {4, 17, 12, 15, 19, 5};
        int[] niz2 = {4, 12, 15, 19, 16, 3};

        int duljina1 = niz1.length;
        int duljina2 = niz2.length;
        int duljina3 = duljina1 + duljina2;
        int[] niz3 = new int[duljina3];
        int j = 0;

        for (int i = 0; i < duljina1; i++) {
            niz3[j] = niz1[i];
            j++;
        }

        for (int element : niz2) {
            niz3[j] = element;
            j++;
        }

        for (int clan : niz3) {
            System.out.print(clan + " ");
        }
    }
}
