package ba.spark.bootcamp.helloworld;

/**
 * Greeting
 */
public class Greeting {

    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public Greeting(String message, Boolean lowercase) {
        if (lowercase) {
            this.message = message.toLowerCase();
        } else {
            this.message = message;
        }
    }

    /**
     * @return the message
     */
    public String getMessage() {
      return message;
    }
}