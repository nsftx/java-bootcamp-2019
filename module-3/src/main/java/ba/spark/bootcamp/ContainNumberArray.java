package ba.spark.bootcamp;

public class ContainNumberArray {
    public static void main(String[] args) {
        int[] niz = {6, 19, 3, 2, 4, 2, 3, 17};
        int brojac2 = 0;
        int brojac3 = 0;

        for (int element : niz) {
            if (element == 2) {
                brojac2++;
            } else if (element == 3) {
                brojac3++;
            }
        }

        if (brojac2 == 2 || brojac3 == 2) {
            System.out.println(true);
        }
    }
}
