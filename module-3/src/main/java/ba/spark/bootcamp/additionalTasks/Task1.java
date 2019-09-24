package ba.spark.bootcamp.additionalTasks;

public class Task1 {
    public static void main(String[] args) {
        int[] niz = {6, 5, 4, 12, 23, 58, 2, 66};
        int min = 2147483647;
        int max = -2147483648;

        for (int element : niz) {
            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }
        }

        System.out.println("Razlika izmedju min i max elemenata je: " + (max - min));

    }
}
