package ba.spark.bootcamp.unitTests;

public class User {

    String firstName;
    String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return this.firstName + ' ' + this.lastName;
    }
}
