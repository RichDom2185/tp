package seedu.address.model.item;

import seedu.address.model.item.itemvalidator.ItemDateValidator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.util.Objects.requireNonNull;

/**
 * Represents an item date in an {@link Item}.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class ItemDate {

    private final LocalDate itemDate;

    private static final String DATE_OUTPUT_PATTERN_REGEX = "dd/MM/yyyy";

    /**
     * Constructs an itemDate.
     *
     * @param dateString a string that represents the itemDate of the format
     */
    public ItemDate(String dateString) {
        requireNonNull(dateString);
        ItemDateValidator.validate(dateString);
        itemDate = LocalDate.parse(dateString);
    }

    /**
     * Returns true if both {@link ItemDate#itemDate} have the same date by
     * {@link LocalDate#equals(Object)}.
     */
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ItemDate // instanceof handles nulls
                && itemDate.equals(((ItemDate) other).itemDate)); // state check
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return itemDate.hashCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return itemDate.format(DateTimeFormatter.ofPattern(DATE_OUTPUT_PATTERN_REGEX));
    }
}
