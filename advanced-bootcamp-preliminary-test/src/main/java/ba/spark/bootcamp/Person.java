package ba.spark.bootcamp;

import java.time.LocalDateTime;
import java.util.Objects;

public class Person {
    private final String fullname;
    private final LocalDateTime dateOfBirth;

    public Person(String fullname, LocalDateTime dateOfBirth) {
        this.fullname = Objects.requireNonNull(fullname);
        this.dateOfBirth = Objects.requireNonNull(dateOfBirth);
    }

    public String getFullname() {
        return fullname;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }
}
