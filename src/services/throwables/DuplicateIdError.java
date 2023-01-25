package services.throwables;

public class DuplicateIdError extends Exception{
    public DuplicateIdError(String id) {
        super(String.format("Id %s already exists.", id));
    }
}
