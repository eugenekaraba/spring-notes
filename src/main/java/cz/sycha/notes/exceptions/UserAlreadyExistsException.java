package cz.sycha.notes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.CONFLICT, reason = "User exists")
public class UserAlreadyExistsException extends RuntimeException {
}
