public class LibraryTest {

    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Create some authors
        Author tolkien = new Author("J.R.R. Tolkien", "1892-01-03");
        Author rowling = new Author("J.K. Rowling", "1965-07-31");

        // Create some books
        Book lotr = new Book("The Lord of the Rings", tolkien, "123456789", "Allen & Unwin", 5);
        Book hp = new Book("Harry Potter and the Philosopher's Stone", rowling, "987654321", "Bloomsbury", 3);

        // Add books to the library
        library.addBook(lotr);
        library.addBook(hp);

        // Add authors to the library
        library.addAuthor(tolkien);
        library.addAuthor(rowling);

        // Test the search functionality
        testSearch(library, "The Lord of the Rings"); // Should find the book
        testSearch(library, "123456789"); // Should find the book by ISBN
        testSearch(library, "The Hobbit"); // Should not find the book
    }

    private static void testSearch(Library library, String query) {
        Book book = library.searchBook(query);
        if (book != null) {
            System.out.println("Book found: " + book.getTitle());
        } else {
            System.out.println("Book not found for query: " + query);
        }
    }
}
