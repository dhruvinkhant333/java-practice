/**
 * Custom exception class for handling book availability scenarios
 */
public class BookNotAvailableException extends Exception {
    
    /**
     * Constructor to create exception with custom message
     * @param message The exception message
     */
    public BookNotAvailableException(String message) {
        super(message);
    }
    
    /**
     * Constructor to create exception with message and cause
     * @param message The exception message
     * @param cause The cause of the exception
     */
    public BookNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }
}
