package by.epam.soundstudio.exceptions;

public class SongsFileNotFoundException extends Exception {
    public SongsFileNotFoundException() {
    }

    public SongsFileNotFoundException(String message) {
        super(message);
    }

    public SongsFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SongsFileNotFoundException(Throwable cause) {
        super(cause);
    }

    public SongsFileNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
