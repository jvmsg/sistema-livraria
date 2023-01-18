package services.throwables;

public class IdNotFoundException extends Exception {
    public IdNotFoundException(String id) {
        super(String.format("Id %s not found.", id));
    }
}
