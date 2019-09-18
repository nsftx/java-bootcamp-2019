package ba.spark.bootcamp;

public class NumberByUnits {
    public static void main(String[] args) {

        int number = 7452;

        int tisucice = number / 1000;
        int stotice = (number % 1000) / 100;
        int desetice = (number % 100) / 10;
        int jedinice = number % 10;

        System.out.println(" Tisucice od " + number + ", su: " + tisucice);
        System.out.println(" Stotice od " + number + ", su: " + stotice);
        System.out.println(" Desetice od " + number + ", su: " + desetice);
        System.out.println(" Jedinice od " + number + ", su: " + jedinice);
    }
}
