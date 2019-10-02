package ba.spark.bootcamp.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/helloworld")
    public Greeting helloworld() {
        return new Greeting("Hello World!");
    }

}
