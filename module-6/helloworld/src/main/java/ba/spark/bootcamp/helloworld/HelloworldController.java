package ba.spark.bootcamp.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/helloworld")
    public ResponseEntity<Greeting> helloworld() {
        Greeting response = new Greeting("Hello World!");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
