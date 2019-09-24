package ba.spark.bootcamp.additionalTasks;

public class Task4 {

    public static void main(String[] args) {
        int[] niz = {6, 5, 4, 12, 23, 58, 2, 66};
        int[] reverse = new int[niz.length];
        int j = 0;

        for (int i = (niz.length - 1); i >= 0; i--) {
            reverse[j] = niz[i];
            j++;
        }

        for (int element : reverse) {
            System.out.print(element + " ");
        }
    }
}
