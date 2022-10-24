package seedu.foodrem.logic.commands.itemcommands;

import static java.util.Objects.requireNonNull;
import static seedu.foodrem.commons.enums.CommandType.INCREMENT_COMMAND;
import static seedu.foodrem.model.Model.PREDICATE_SHOW_ALL_ITEMS;

import java.util.List;

import seedu.foodrem.commons.core.Messages;
import seedu.foodrem.commons.core.index.Index;
import seedu.foodrem.logic.commands.Command;
import seedu.foodrem.logic.commands.CommandResult;
import seedu.foodrem.logic.commands.exceptions.CommandException;
import seedu.foodrem.model.Model;
import seedu.foodrem.model.item.Item;
import seedu.foodrem.model.item.ItemQuantity;
import seedu.foodrem.viewmodels.ItemWithMessage;

/**
 * Increments the quantity of an item by a specified amount.
 */
public class IncrementCommand extends Command {
    public static final String MESSAGE_SUCCESS = "Incremented successfully and updated item as follows:";

    private final Index index;
    private final ItemQuantity quantity;

    /**
     * @param index    of the item in the filtered item list to increment.
     * @param quantity quantity of the item to increment.
     */
    public IncrementCommand(Index index, ItemQuantity quantity) {
        requireNonNull(index);
        requireNonNull(quantity);

        this.index = index;
        this.quantity = quantity;
    }

    /**
     * Creates and returns an {@code Item} with the quantity of {@code itemToEdit}
     * incremented by {@code editItemDescriptor}.
     */
    private static Item createIncrementedItem(Item itemToIncrement, ItemQuantity quantity) {
        assert itemToIncrement != null;

        ItemQuantity incrementedQuantity;
        try {
            incrementedQuantity = ItemQuantity.performArithmeticOperation(
                    itemToIncrement.getQuantity(), quantity, Double::sum);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("(Final Quantity) " + e.getMessage());
        }

        return new Item(itemToIncrement.getName(),
                incrementedQuantity,
                itemToIncrement.getUnit(),
                itemToIncrement.getBoughtDate(),
                itemToIncrement.getExpiryDate(),
                itemToIncrement.getPrice(),
                itemToIncrement.getRemarks());
    }

    @Override
    public CommandResult<ItemWithMessage> execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Item> lastShownList = model.getFilteredItemList();

        if (index.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_ITEMS_DISPLAYED_INDEX);
        }

        Item itemToIncrement = lastShownList.get(index.getZeroBased());
        Item incrementedItem = createIncrementedItem(itemToIncrement, quantity);

        model.setItem(itemToIncrement, incrementedItem);
        model.updateFilteredItemList(PREDICATE_SHOW_ALL_ITEMS);
        return CommandResult.from(new ItemWithMessage(incrementedItem, MESSAGE_SUCCESS));
    }

    public static String getUsage() {
        return INCREMENT_COMMAND.getUsage();
    }
}
