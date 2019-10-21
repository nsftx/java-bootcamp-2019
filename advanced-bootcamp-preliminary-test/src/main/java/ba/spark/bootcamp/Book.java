package ba.spark.bootcamp;

import java.util.Objects;

public final class Book {

    private final Author author;
    private final String title;
    private final Genre genre;

    public Book(Author author, String title, Genre genre) {
        this.author = Objects.requireNonNull(author);
        this.title = Objects.requireNonNull(title);
        this.genre = Objects.requireNonNull(genre);
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public enum Genre {
        ACTION,
        COMEDY,
        ROMANCE,
        DRAMA
    }
}
