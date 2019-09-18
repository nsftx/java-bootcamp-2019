package ba.spark.bootcamp;

public class DataType {
    public static void main(String[] args) {
        boolean isTrue = true ;
        boolean isFalse = false;

        System.out.println(" First one is: " + isTrue);
        System.out.println(" Second one is: " + isFalse);

        boolean defaultValue = false;
        System.out.println(" Default value is: " + defaultValue);

        byte smallOne = 25;
        int hugOne = 2568;

        System.out.println(" Byte variable " + smallOne);
        System.out.println(" int variable " + hugOne);

        int number = 0;
        float decimal = 0;

        System.out.println(" Int default value is: " + number);
        System.out.println(" Float default value is: " + decimal);

        char letter = 'A';
        System.out.println(" Char example: " + letter);

        String first = " Hello world!";
        String second = new String(" Hello world!");

        System.out.println(" First: " + first);
        System.out.println( " Second: " + second);
    }
}
