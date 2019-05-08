package by.epam.soundstudio.exceptions;

public class FileNotFound extends RuntimeException {

    public FileNotFound() {
        super();
    }

    public FileNotFound(String message) {
        super(message);
    }

    public FileNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public FileNotFound(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    public void test(){};
}
