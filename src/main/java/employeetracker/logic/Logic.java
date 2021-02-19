package employeetracker.logic;

import java.nio.file.Path;

import employeetracker.commons.core.GuiSettings;
import employeetracker.logic.commands.CommandResult;
import employeetracker.logic.commands.exceptions.CommandException;
import employeetracker.logic.parser.exceptions.ParseException;
import employeetracker.model.ReadOnlyEmployeeTracker;
import employeetracker.model.person.Person;
import javafx.collections.ObservableList;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException If an error occurs during parsing.
     */
    CommandResult execute(String commandText) throws CommandException, ParseException;

    /**
     * Returns the EmployeeTracker.
     *
     * @see employeetracker.model.Model#getEmployeeTracker()
     */
    ReadOnlyEmployeeTracker getAddressBook();

    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Person> getFilteredPersonList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Set the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);
}
