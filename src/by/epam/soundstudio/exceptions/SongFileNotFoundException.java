/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.exceptions;

public class SongFileNotFoundException extends Exception {

    public SongFileNotFoundException() {
    }

    public SongFileNotFoundException(String message) {
        super(message);
    }

    public SongFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SongFileNotFoundException(Throwable cause) {
        super(cause);
    }

    public SongFileNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
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
