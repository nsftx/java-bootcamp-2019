package ba.spark.bootcamp.helloworld;

import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/helloworld")
    public ResponseEntity<Greeting> helloworld() {
        Greeting response = new Greeting("Hello World!");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/helloworld/{name}")
    public ResponseEntity<Greeting> helloworld(
        @PathVariable("name") String name,
        @RequestParam(value = "lowercase", required = false) Boolean lowercase
    ) {
        Greeting response = new Greeting(
            String.format("Hello World, %s!", name),
            Objects.requireNonNullElse(lowercase, false)
        );

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
