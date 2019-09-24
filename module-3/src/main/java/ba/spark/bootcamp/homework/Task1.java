package ba.spark.bootcamp.homework;

public class Task1 {

    public static void main(String[] args) {
        int x = 259;
        int brojac = 0;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                brojac++;
            }
        }

        if (brojac > 1) {
            System.out.println("Broj " + x + " je složen, nije prost");
        } else {
            System.out.println(" Broj " + x + " je prost");
        }
    }
}
