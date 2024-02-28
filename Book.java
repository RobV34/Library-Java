/**
 * Represents a book that can be borrowed.
 */
public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numberOfCopies;
    private Status status;

    /**
     * Constructs a book with the given details.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The ISBN of the book.
     * @param publisher     The publisher of the book.
     * @param numberOfCopies The number of copies available.
     */
    public Book(String title, Author author, String ISBN, String publisher, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = Status.AVAILABLE;
    }

    /**
     * Retrieves the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the author of the book.
     *
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The author of the book.
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Retrieves the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param ISBN The ISBN of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Retrieves the publisher of the book.
     *
     * @return The publisher of the book.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher of the book.
     *
     * @param publisher The publisher of the book.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Retrieves the number of copies available.
     *
     * @return The number of copies available.
     */
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    /**
     * Sets the number of copies available.
     *
     * @param numberOfCopies The number of copies available.
     */
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    /**
     * Retrieves the status of the book.
     *
     * @return The status of the book.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the book.
     *
     * @param status The status of the book.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Allows borrowing a specified number of copies of the book.
     *
     * @param numberOfCopies The number of copies to borrow.
     */
    @Override
    public void borrowBook(int numberOfCopies) {
        if (this.numberOfCopies >= numberOfCopies) {
            this.numberOfCopies -= numberOfCopies;
            this.status = Status.CHECKED_OUT;
            System.out.println(numberOfCopies + " copies of " + title + " borrowed successfully.");
        } else {
            System.out.println("Not enough copies available to borrow.");
        }
    }

    /**
     * Allows returning a specified number of copies of the book.
     *
     * @param numberOfCopies The number of copies to return.
     */
    @Override
    public void returnBook(int numberOfCopies) {
        this.numberOfCopies += numberOfCopies;
        this.status = Status.AVAILABLE;
        System.out.println(numberOfCopies + " copies of " + title + " returned successfully.");
    }
}


