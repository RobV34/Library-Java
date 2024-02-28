import java.util.ArrayList;
import java.util.List;

/**
 * Represents a patron who can borrow books from the library.
 */
public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    /**
     * Constructs a patron with the given details.
     *
     * @param name        The name of the patron.
     * @param address     The address of the patron.
     * @param phoneNumber The phone number of the patron.
     */
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>(); // Initialize the borrowedBooks list
    }

    /**
     * Retrieves the name of the patron.
     *
     * @return The name of the patron.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the patron.
     *
     * @param name The name of the patron.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the address of the patron.
     *
     * @return The address of the patron.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the patron.
     *
     * @param address The address of the patron.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the phone number of the patron.
     *
     * @return The phone number of the patron.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the patron.
     *
     * @param phoneNumber The phone number of the patron.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the list of books borrowed by the patron.
     *
     * @return The list of borrowed books.
     */
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    /**
     * Sets the list of books borrowed by the patron.
     *
     * @param borrowedBooks The list of borrowed books.
     */
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    /**
     * Allows the patron to borrow a specified number of copies of a book.
     *
     * @param book          The book to borrow.
     * @param numberOfCopies The number of copies to borrow.
     */
    public void borrowBook(Book book, int numberOfCopies) {
        book.borrowBook(numberOfCopies);
        borrowedBooks.add(book);
    }

    /**
     * Allows the patron to return a specified number of copies of a borrowed book.
     *
     * @param book          The book to return.
     * @param numberOfCopies The number of copies to return.
     */
    public void returnBook(Book book, int numberOfCopies) {
        book.returnBook(numberOfCopies);
        borrowedBooks.remove(book);
    }
}

