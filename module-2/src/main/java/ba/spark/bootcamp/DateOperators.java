package ba.spark.bootcamp;

public class DateOperators {
    public static void main(String[] args) {
        byte number1 = 45;
        int number2 = 4544;
        double number3 = 1.89;

        System.out.println(" Result: " + number1 + number2 + number3);
        System.out.println(" Result2 :  " + (number1 + number2) + number3);
        System.out.println(" Result3 :  " + ((number1 + number2) + number3));


        double result = 4545 / 45;
        int result2 = 4545 / 45;
        System.out.println(" Result: " + result);
        System.out.println(" Result2: " + result2);

        int number4 = number2 % number1;
        System.out.println(" Module example: " + number4);
    }
}
