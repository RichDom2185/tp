package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ITEM_BOUGHT_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ITEM_EXPIRY_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ITEM_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ITEM_QUANTITY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ITEM_UNIT;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.EditCommand.EditItemDescriptor;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.tag.Tag;

/**
 * Parses input arguments and creates a new EditCommand object
 */
public class EditCommandParser implements Parser<EditCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the EditCommand
     * and returns an EditCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public EditCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap =
            ArgumentTokenizer.tokenize(args,
                PREFIX_ITEM_NAME,
                PREFIX_ITEM_QUANTITY,
                PREFIX_ITEM_UNIT,
                PREFIX_ITEM_BOUGHT_DATE,
                PREFIX_ITEM_EXPIRY_DATE);
        Index index;

        try {
            index = ParserUtil.parseIndex(argMultimap.getPreamble());
        } catch (ParseException pe) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, EditCommand.MESSAGE_USAGE), pe);
        }

        EditItemDescriptor editItemDescriptor = new EditItemDescriptor();
        if (argMultimap.getValue(PREFIX_ITEM_NAME).isPresent()) {
            editItemDescriptor.setItemName(ParserUtil.parseName(argMultimap.getValue(PREFIX_ITEM_NAME).get()));
        }
        if (argMultimap.getValue(PREFIX_ITEM_QUANTITY).isPresent()) {
            editItemDescriptor.setItemQuantity(
                ParserUtil.parseQuantity(argMultimap.getValue(PREFIX_ITEM_QUANTITY).get()));
        }
        if (argMultimap.getValue(PREFIX_ITEM_UNIT).isPresent()) {
            editItemDescriptor.setItemUnit(
                ParserUtil.parseUnit(argMultimap.getValue(PREFIX_ITEM_UNIT).get()));
        }
        if (argMultimap.getValue(PREFIX_ITEM_BOUGHT_DATE).isPresent()) {
            editItemDescriptor.setItemBoughtDate(
                ParserUtil.parseBoughtDate(argMultimap.getValue(PREFIX_ITEM_BOUGHT_DATE).get()));
        }
        if (argMultimap.getValue(PREFIX_ITEM_EXPIRY_DATE).isPresent()) {
            editItemDescriptor.setItemExpiryDate(
                ParserUtil.parseExpiryDate(argMultimap.getValue(PREFIX_ITEM_EXPIRY_DATE).get()));
        }
        // parseTagsForEdit(argMultimap.getAllValues(PREFIX_TAG)).ifPresent(editItemDescriptor::setTags);

        if (!editItemDescriptor.isAnyFieldEdited()) {
            throw new ParseException(EditCommand.MESSAGE_NOT_EDITED);
        }

        return new EditCommand(index, editItemDescriptor);
    }

    /**
     * Parses {@code Collection<String> tags} into a {@code Set<Tag>} if {@code tags} is non-empty.
     * If {@code tags} contain only one element which is an empty string, it will be parsed into a
     * {@code Set<Tag>} containing zero tags.
     */
    private Optional<Set<Tag>> parseTagsForEdit(Collection<String> tags) throws ParseException {
        assert tags != null;

        if (tags.isEmpty()) {
            return Optional.empty();
        }
        Collection<String> tagSet = tags.size() == 1 && tags.contains("") ? Collections.emptySet() : tags;
        return Optional.of(ParserUtil.parseTags(tagSet));
    }

}
