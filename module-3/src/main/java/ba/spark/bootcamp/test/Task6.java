package ba.spark.bootcamp.test;

public class Task6 {
    public static void main(String[] args) {
        String prva = "ada";
        String druga = "juka";
        int duljina1 = prva.length();
        int duljina2 = druga.length();

        boolean isPrvaTrue = true;
        for (int i = 0; i < duljina1 / 2; i++) {
            if (prva.charAt(i) != prva.charAt(duljina1 - 1 - i)) {
                isPrvaTrue = false;
            }
        }

        System.out.println(" prva je palindrom: " + isPrvaTrue);

        boolean isDrugaTrue = true;
        for (int i = 0; i < duljina2 / 2; i++) {
            if (druga.charAt(i) != druga.charAt(duljina1 - 1 - i)) {
                isDrugaTrue = false;
            }
        }

        System.out.println(" Druga je palindrom: " + isDrugaTrue);
    }
}
