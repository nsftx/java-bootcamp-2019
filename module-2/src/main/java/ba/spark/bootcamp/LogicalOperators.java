package ba.spark.bootcamp;

public class LogicalOperators {
    public static void main(String[] args) {

        int number1 = 124;
        int number2 = 452;
        int number3 = 41;

        boolean result1 = number1 >= number2;
        boolean result2 = number2 < number3;
        boolean result3 = number3 != number1;

        System.out.println(" First result is: " + result1);
        System.out.println(" Second result is: " + result2);
        System.out.println(" Third result is: " + result3);
    }
}
