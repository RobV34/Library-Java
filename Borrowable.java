/**
 * The Borrowable interface represents an item that can be borrowed from a library.
 * It provides methods for borrowing and returning the item.
 */
public interface Borrowable {
    /**
     * Borrow the specified number of copies of the item.
     *
     * @param numberOfCopies The number of copies to borrow.
     */
    void borrowBook(int numberOfCopies);

    /**
     * Return the specified number of copies of the item.
     *
     * @param numberOfCopies The number of copies to return.
     */
    void returnBook(int numberOfCopies);
}


