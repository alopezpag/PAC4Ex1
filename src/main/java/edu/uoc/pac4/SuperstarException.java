package edu.uoc.pac4;

public class SuperstarException extends Exception {
    // Constants for error messages
    public static final String MSG_ERR_BIRTH_NAME_NULL = "Superstar's birth name mustn't be null";
    public static final String MSG_ERR_BIRTH_NAME_LENGTH = "Superstar's birth name must have between 1 and 60 characters";
    public static final String MSG_ERR_BIRTH_NAME_NUMBERS = "Superstar's birth name mustn't have any numbers";
    public static final String MSG_ERR_BIRTH_DATE = "Superstar's birth date mustn't be null and it must be before today";
    public static final String MSG_ERR_BIRTHPLACE_NULL = "Superstar's birthplace mustn't be null";
    public static final String MSG_ERR_BIRTHPLACE_LENGTH = "Superstar's birthplace must have between 1 and 80 characters";
    public static final String MSG_ERR_HEIGHT = "Superstar's height must be greater than 100 cm";
    public static final String MSG_ERR_WEIGHT = "Superstar's weight must be greater than 30 kg";
    public static final String MSG_ERR_RING_NAME_NULL = "Superstar's ring name mustn't be null";
    public static final String MSG_ERR_RING_NAME_LENGTH = "Superstar's ring name must have between 1 and 60";

    // Constructor that accepts a message
    public SuperstarException(String msg) {
        super(msg);
    }

    // Optional: Constructor that accepts a message and a cause
    /*public SuperstarException(String msg, Throwable cause) {
        super(msg, cause);
    }*/

    // Optional: Overriding the getMessage() method to customize the error message
    @Override
    public String getMessage() {
        return "SuperstarException: " + super.getMessage();
    }
}
