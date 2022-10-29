package seedu.foodrem.commons.exceptions;

/**
 * Represents an error when more items are added when the storage is full.
 */
public class TagStorageFullException extends StorageFullException {
    public TagStorageFullException(int maxNumberOfTags) {
        super(String.format("The tag storage is full. FoodRem can only hold up to %s tags.", maxNumberOfTags));
    }
    public TagStorageFullException(String message) {
        super(message);
    }
}