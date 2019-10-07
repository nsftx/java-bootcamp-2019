package ba.spark.bootcamp.rest.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ba.spark.bootcamp.rest.model.User;
import ba.spark.bootcamp.rest.model.UserRepository;

@RestController
public class UserResource {

    private UserRepository repository;

    // This will auto-inject instance of 
    // UserRepository component into our controller
    @Autowired
    public UserResource(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/users")
    public ResponseEntity<Void> saveUser(@RequestBody User user) {
        repository.save(user);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> listUsers() {
        List<User> users = repository.findAll();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id) {

        User user = repository.findOne(id);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // MISSING (1):
    // Add new handler method for `PUT /users/{id}` named `updateUser`
    // It must accept updated User object as Request body
    // Use appropriate repository method to update the existing user object by passed ID
    // It must return 204 No content status

    // MISSING (2):
    // Add new handler method of `DELETE /users/{id}` named `deleteUser`
    // Use appropriate repository method to delete existing user
    // It must return 204 No content status (no response body)
}
