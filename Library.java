import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library containing books, authors, and patrons.
 */
public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    /**
     * Constructs a library with empty lists of books, authors, and patrons.
     */
    public Library() {
        this.books = new ArrayList<>(); // Initialize the books list
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    /**
     * Retrieves a copy of the list of books in the library.
     *
     * @return A copy of the list of books.
     */
    public List<Book> getBooks() {
        return new ArrayList<>(books); // Return a copy of the list
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book from the library.
     *
     * @param book The book to remove.
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Adds an author to the library.
     *
     * @param author The author to add.
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     * Removes an author from the library.
     *
     * @param author The author to remove.
     */
    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    /**
     * Adds a patron to the library.
     *
     * @param patron The patron to add.
     */
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    /**
     * Removes a patron from the library.
     *
     * @param patron The patron to remove.
     */
    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    /**
     * Retrieves a copy of the list of patrons in the library.
     *
     * @return A copy of the list of patrons.
     */
    public List<Patron> getPatrons() {
        return new ArrayList<>(patrons); // Return a copy of the list
    }

    /**
     * Searches for a book in the library based on title, author's name, or ISBN.
     *
     * @param query The search query (title, author's name, or ISBN).
     * @return The book found or null if not found.
     */
    public Book searchBook(String query) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().getName().equalsIgnoreCase(query) || book.getISBN().equalsIgnoreCase(query)) {
                return book;
            }
        }
        return null;
    }
}




