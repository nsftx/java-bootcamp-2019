package ba.spark.bootcamp;

public class IfStatementDay {
    public static void main(String[] args) {

        int numberDay = 3;
        String stringDay;

        if(numberDay == 1){
            stringDay = "Monday";
        } else if (numberDay == 2){
            stringDay = "Tuesday";
        } else if (numberDay == 3){
            stringDay = "Wensday";
        }else {
            stringDay = "Invalid day";
        }

        System.out.println(" Day is: " + stringDay);
    }
}
