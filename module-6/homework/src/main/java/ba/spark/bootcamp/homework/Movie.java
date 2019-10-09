package ba.spark.bootcamp.homework;

public class Movie {

    private int id;
    private String name;
    private int rating;

    public Movie(int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }
}
