
public class Main {
    public static void main(String[] args) {
        // Create library and initialize it with data
        Library library = new Library();
        initializeLibrary(library);

        // Perform more transactions
        performTransactions(library);
    }

    private static void initializeLibrary(Library library) {
        // Create authors
        Author author1 = new Author("J.K. Rowling", "31 July 1965");
        Author author2 = new Author("George Orwell", "25 June 1903");
        Author author3 = new Author("Stephen King", "21 September 1947");
        Author author4 = new Author("J.R.R. Tolkien", "3 January 1892");
        Author author5 = new Author("Agatha Christie", "15 September 1890");

        // Add authors to library
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);
        library.addAuthor(author4);
        library.addAuthor(author5);

        // Create books
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, "978-0747532743",
                "Bloomsbury Publishing", 10);
        Book book2 = new Book("1984", author2, "978-0451524935", "Signet Classics", 7);
        Book book3 = new Book("The Shining", author3, "978-0307743657", "Anchor", 5);
        Book book4 = new Book("The Hobbit", author4, "978-0345534835", "Del Rey", 3);
        Book book5 = new Book("Murder on the Orient Express", author5, "978-0062693662", "William Morrow Paperbacks",
                6);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Create patrons
        Patron patron1 = new Patron("John Doe", "123 Main St", "555-1234");
        Patron patron2 = new Patron("Jane Smith", "456 Oak St", "555-5678");
        Patron patron3 = new Patron("Tom Brown", "789 Elm St", "555-9101");
        Patron patron4 = new Patron("Alice Johnson", "101 Pine St", "555-1213");
        Patron patron5 = new Patron("Bob White", "314 Elm St", "555-1415");

        // Add patrons to library
        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);
        library.addPatron(patron4);
        library.addPatron(patron5);

    }

    private static void performTransactions(Library library) {
        // Retrieve books and patrons by their details
        Book book1 = library.searchBook("Harry Potter and the Philosopher's Stone");
        Book book2 = library.searchBook("1984");
        Patron patron1 = library.getPatrons().get(0); // assuming patron1 is the first added patron
        Patron patron2 = library.getPatrons().get(1); // assuming patron2 is the second added patron

        // Perform borrowing transactions
        if (book1 != null && patron1 != null) {
            System.out.println("\nPatron 1 borrows a book:");
            patron1.borrowBook(book1, 1);
        }
        // Patron 2 tries to borrow the same book
        if (book1 != null && patron2 != null) {
            System.out.println("\nPatron 2 tries to borrow the same book:");
            patron2.borrowBook(book1, 1);
        }

        // Patron 2 tries to borrow a different book
        if (book2 != null && patron2 != null) {
            System.out.println("\nPatron 2 borrows a book:");
            patron2.borrowBook(book2, 1); // Now using book2
        }

        
        // Display borrowed books for Patron 1
        System.out.println("\nBooks borrowed by Patron 1:");
        for (Book book : patron1.getBorrowedBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor().getName() + ", ISBN: "
                    + book.getISBN());
        }

        // Patron 1 returns a book
        System.out.println("\nPatron 1 returns a book:");
        patron1.returnBook(book1, 1);

        // Display available copies of book1 after transactions
        System.out.println("\nAvailable copies of 'Harry Potter and the Philosopher's Stone' after transactions: "
                + book1.getNumberOfCopies());

        // Display borrowed books for Patron 1 after returning book
        System.out.println("\nBooks borrowed by Patron 1 after returning book:");
        for (Book book : patron1.getBorrowedBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor().getName() + ", ISBN: "
                    + book.getISBN());
        }

        // Display borrowed books for Patron 2
        System.out.println("\nBooks borrowed by Patron 2:");
        for (Book book : patron2.getBorrowedBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor().getName() + ", ISBN: "
                    + book.getISBN());
        }

        if (book2 != null) {
            System.out.println("\nAvailable copies of '1984' after transactions: " + book2.getNumberOfCopies());
        }
    }
}
