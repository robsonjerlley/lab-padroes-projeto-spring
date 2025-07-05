package one.digitalinnovation.gof.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ClienteFullException extends RuntimeException {


    public ClienteFullException() { super("Cliente Not Fund");
    }

    public ClienteFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
