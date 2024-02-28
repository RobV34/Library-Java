import java.util.List;

/**
 * Represents an author with a name, date of birth, and a list of books they
 * have written.
 */
public class Author {
    private String name; // The name of the author
    private String dateOfBirth; // The date of birth of the author
    private List<Book> booksWritten; // A list of books written by the author

    /**
     * Constructs an Author with the specified name and date of birth.
     *
     * @param name        The name of the author.
     * @param dateOfBirth The date of birth of the author.
     */
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the name of the author.
     *
     * @return The name of the author.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the author.
     *
     * @param name The new name of the author.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the date of birth of the author.
     *
     * @return The date of birth of the author.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the author.
     *
     * @param dateOfBirth The new date of birth of the author.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the list of books written by the author.
     *
     * @return The list of books.
     */
    public List<Book> getBooksWritten() {
        return booksWritten;
    }

    /**
     * Sets the list of books written by the author.
     *
     * @param booksWritten The new list of books written by the author.
     */
    public void setBooksWritten(List<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }

    /**
     * Adds a book to the list of books written by the author.
     *
     * @param book The book to add to the list.
     */
    public void addBook(Book book) {
        booksWritten.add(book);
    }
}
