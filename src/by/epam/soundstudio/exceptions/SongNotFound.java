package by.epam.soundstudio.exceptions;

public class SongNotFound extends RuntimeException {

    public SongNotFound() {
        super();
    }

    public SongNotFound(String message) {
        super(message);
    }

    public SongNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public SongNotFound(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
