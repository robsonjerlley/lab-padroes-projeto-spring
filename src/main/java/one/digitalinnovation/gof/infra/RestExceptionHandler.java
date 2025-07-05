package one.digitalinnovation.gof.infra;

import one.digitalinnovation.gof.exceptions.ClienteFullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ClienteFullException.class)
    private ResponseEntity<String>clienteFullExceptionHandelr(ClienteFullException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CLIENTE NOT FOUND");
    }


}


