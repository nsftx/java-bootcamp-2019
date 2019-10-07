package ba.spark.bootcamp.rest.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ba.spark.bootcamp.rest.model.UserRepository;

/**
 * UserController
 */
@RestController
public class TodoResource {

    private UserRepository repository;

    @Autowired
    public TodoResource(UserRepository repository) {
        this.repository = repository;
    }

    // MISSING (1):
    // Add `POST /users/{userId}/todos` handler method named `saveTodo`.
    // Request body must be serialized into Todo object.
    // Use appropriate repository method to find user by `userId`;
    // Use appropriate `User` method to add the passed Todo object to list of User todos.
    // The method must return `201 Created` status code and no response body

    // MISSING (2):
    // Add new handler method for `PUT /users/{userId}/todos/{id}` named `updateTodo`
    // It must accept updated Todo object as Request body
    // Use appropriate repository method to find user by `userId`;
    // Use appropriate `User` method to update the existing Todo object
    // It must return `204 No content` status code (and no response body)

    // MISSING (3):
    // Add new handler method for `GET /users/{userId}/todos` named `listTodos`
    // It must accept an optional request parameter named `open` of Boolean type
    // Use appropriate repository method to find the user by `userId`;
    // Use appropriate `User` method to find all todos (by passed `open` query paramter)
    // It will return `200 OK` status code and (un)filtered list of Todos in body.

    // MISSING (4):
    // Add new handler method for `GET /users/{userId}/todos/{id}` named `getTodo`
    // Use appropriate repository method to find user by `userId`;
    // Use appropriate `User` method to find todo by `id`.
    // The method must return `200 OK` status code and found `Todo` in body

    // MISSING (5):
    // Add new handler method of `DELETE /users/{userId}/todos/{id}` named `deleteTodo`
    // Use appropriate repository method to find user by `userId`;
    // Use appropriate `User` method to delete existing todo by `id`
    // It must return 204 No content status (no response body)
}
