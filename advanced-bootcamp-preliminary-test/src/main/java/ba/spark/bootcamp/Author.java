package ba.spark.bootcamp;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Author extends Person {

    private final Set<Book> books = new HashSet<>();

    public Author(String fullname, LocalDateTime dateOfBirth) {
        super(fullname, dateOfBirth);
    }

    public Set<Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

    public void addBook(Book book) {
        books.add(Objects.requireNonNull(book));
    }
}
