package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	  public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException ex) {
	    StandardError error = new StandardError();
	    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	  }

}
