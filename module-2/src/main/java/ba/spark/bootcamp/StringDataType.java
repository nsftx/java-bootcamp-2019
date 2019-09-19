package ba.spark.bootcamp;

public class StringDataType {

    public static void main(String[] args) {
        String planet = "Earth";
        System.out.println(" String planet length: " + planet.length());

        System.out.println(" first letter in planet is: " + planet.substring(0, 1));

        System.out.println(" last letter in planet is: " + planet
                .substring(planet.length() - 1, planet.length()));

        planet = planet.concat(" planet ");

        System.out.println(" whole name of planet is: " + planet);
    }
}
