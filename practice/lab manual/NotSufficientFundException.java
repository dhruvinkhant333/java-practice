/**
 * Custom exception class for handling insufficient fund scenarios
 */
public class NotSufficientFundException extends Exception {
    
    /**
     * Constructor to create exception with custom message
     * @param message The exception message
     */
    public NotSufficientFundException(String message) {
        super(message);
    }
    
    /**
     * Constructor to create exception with message and cause
     * @param message The exception message
     * @param cause The cause of the exception
     */
    public NotSufficientFundException(String message, Throwable cause) {
        super(message, cause);
    }
}
