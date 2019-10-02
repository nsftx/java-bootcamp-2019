package ba.spark.bootcamp.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloworld() {
        return "Hello World!";
    }

}
