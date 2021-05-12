package jdash.client.exception;

public class GDClientException extends RuntimeException {

    public GDClientException() {
    }

    public GDClientException(String message) {
        super(message);
    }

    public GDClientException(Throwable cause) {
        super(cause);
    }

    public GDClientException(String message, Throwable cause) {
        super(message, cause);
    }
}