package ba.spark.bootcamp;

public class IfStatementDay {
    public static void main(String[] args) {

        int numberDay = 3;
        String stringDay;

        if (numberDay == 1) {
            stringDay = "Monday";
        } else if (numberDay == 2) {
            stringDay = "Tuesday";
        } else if (numberDay == 3) {
            stringDay = "Wednesday";
        } else if (numberDay == 4) {
            stringDay = "Thursday";
        } else if (numberDay == 5) {
            stringDay = "Friday";
        } else if (numberDay == 6) {
            stringDay = "Saturday";
        } else if (numberDay == 7) {
            stringDay = "Sunday";
        } else {
            stringDay = "Invalid day";
        }

        System.out.println(" Day is: " + stringDay);
    }
}
