package ba.spark.bootcamp;

public class NumberByUnits {
    public static void main(String[] args) {

        int number = 7452;

        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        System.out.println(" Thousands part of " + number + ", is: " + thousands);
        System.out.println(" Hundreds part of " + number + ", is: " + hundreds);
        System.out.println(" Tens part of " + number + ", is: " + tens);
        System.out.println(" Unit part of " + number + ", is: " + units);
    }
}
