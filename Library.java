import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>(); // Initialize the books list
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books); // Return a copy of the list
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    // Method to get all patrons
    public List<Patron> getPatrons() {
        return new ArrayList<>(patrons); // Return a copy of the list
    }

    public Book searchBook(String query) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().getName().equalsIgnoreCase(query) || book.getISBN().equalsIgnoreCase(query)) {
                return book;
            }
        }
        return null;
    }
}



