package ba.spark.bootcamp.additionalTasks;

public class Task2 {
    public static void main(String[] args) {
        int[] niz = {6, 5, 4, 12, 23, 58, 2, 66};
        double suma =0;

        for (int element: niz){
            suma += element;
        }

        System.out.println(" prosjecna velicina niza je: " + (suma/niz.length));
    }
}
