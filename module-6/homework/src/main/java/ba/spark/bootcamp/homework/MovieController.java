package ba.spark.bootcamp.homework;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private static List<Movie> movies;

    static {
        movies = new ArrayList<>();
        movies.add(new Movie(1, "Jocker", 8));
        movies.add(new Movie(2, "It: Chapter Two", 7));
        movies.add(new Movie(3, "Ad Astra", 7));
        movies.add(new Movie(4, "Rambo: Last blood", 6));
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> listMovies(@RequestParam(value = "rating", required = false) Integer rating) {
        if (rating == null) {
            return new ResponseEntity<>(movies, HttpStatus.OK);
        }

        List<Movie> results = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getRating() == rating) {
                results.add(movie);
            }
        }

        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return new ResponseEntity<>(movie, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
