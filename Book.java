

public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numberOfCopies;
    private Status status;

    public Book(String title, Author author, String ISBN, String publisher, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

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

    @Override
    public void returnBook(int numberOfCopies) {
        this.numberOfCopies += numberOfCopies;
        this.status = Status.AVAILABLE;
        System.out.println(numberOfCopies + " copies of " + title + " returned successfully.");
    }
}

