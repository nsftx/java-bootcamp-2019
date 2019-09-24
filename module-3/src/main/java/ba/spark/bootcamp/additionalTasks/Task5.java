package ba.spark.bootcamp.additionalTasks;

public class Task5 {

    public static void main(String[] args) {

        int[] niz = {6, 8, 4, 2};
        int brojacSlozenih = 0;
        int brojacProstih = 0;
        int brojac;

        for (int element : niz) {
            if (element <= 3) {
                brojacProstih++;
            } else {
                brojac = 0;
                for (int i = 2; i < element; i++) {
                    if (element % i == 0) {
                        brojac++;
                    }
                }

                if (brojac > 0) {
                    brojacSlozenih++;
                } else {
                    brojacProstih++;
                }
            }
        }

        if (brojacProstih == 3 || brojacSlozenih == 3) {
            System.out.println(true);
        }
    }
}
