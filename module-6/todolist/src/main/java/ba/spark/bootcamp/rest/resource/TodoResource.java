package ba.spark.bootcamp.rest.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ba.spark.bootcamp.rest.model.Todo;
import ba.spark.bootcamp.rest.model.User;
import ba.spark.bootcamp.rest.model.UserRepository;

@RestController
public class TodoResource {

    private UserRepository repository;

    @Autowired
    public TodoResource(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/users/{userId}/todos")
    public ResponseEntity<Void> saveTodo(@PathVariable("userId") int userId,
            @RequestBody Todo todo) {
        repository.findOne(userId).addTodo(todo);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/users/{userId}/todos/{id}")
    public ResponseEntity<Void> updateTodo(@PathVariable("userId") int userId,
            @PathVariable("id") int id, @RequestBody Todo todo) {
        repository.findOne(userId).updateTodo(id, todo);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/users/{userId}/todos")
    public ResponseEntity<List<Todo>> listTodos(@PathVariable("userId") int userId,
            @RequestParam(name = "open", required = false) Boolean isOpen) {
        User user = repository.findOne(userId);

        return new ResponseEntity<>(user.findTodos(isOpen), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{userId}/todos/{id}")
    public ResponseEntity<Todo> getTodo(@PathVariable("userId") int userId,
            @PathVariable("id") int id) {

        Todo todo = repository.findOne(userId).findSingleTodo(id);

        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @DeleteMapping(value = "/users/{userId}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable("userId") int userId,
            @PathVariable("id") int id) {
        repository.findOne(userId).deleteTodo(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
