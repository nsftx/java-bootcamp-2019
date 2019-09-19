package ba.spark.bootcamp;

public class DataType {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(" First one is: " + isTrue);
        System.out.println(" Second one is: " + isFalse);

        boolean defaultValue = false;
        System.out.println(" Default value is: " + defaultValue);

        byte smallOne = 25;
        int hugeOne = 2568;

        System.out.println(" Byte variable " + smallOne);
        System.out.println(" int variable " + hugeOne);

        int number = 0;
        float decimalNumber = 0;

        System.out.println(" Int default value is: " + number);
        System.out.println(" Float default value is: " + decimalNumber);

        char letter = 'A';
        System.out.println(" Char example: " + letter);

        String firstString = " Hello world!";
        String secondString = new String(" Hello world!");

        System.out.println(" First: " + firstString);
        System.out.println(" Second: " + secondString);
    }
}
