package ba.spark.bootcamp.rest.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 4745611105841866068L;

    public UserNotFoundException(int id) {
        super(String.format("User with id '%s' not found", id));
    }
}