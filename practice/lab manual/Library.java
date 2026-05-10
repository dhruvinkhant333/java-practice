public class Library {
    
    private int availableBooks;
    
    /**
     * Constructor to initialize the library with a specific number of available books
     * @param availableBooks The number of available books
     */
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
        System.out.println("Library initialized with " + availableBooks + " available books.");
    }
    
    /**
     * Method to issue books from the library
     * @param count The number of books to issue
     * @throws BookNotAvailableException if requested books exceed available books
     */
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully. Books issued: " + count);
            displayAvailableBooks();
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
    
    /**
     * Method to display the current number of available books
     */
    public void displayAvailableBooks() {
        System.out.println("Available books in library: " + availableBooks);
    }
    
    /**
     * Method to get the current number of available books
     * @return The number of available books
     */
    public int getAvailableBooks() {
        return availableBooks;
    }
    
    /**
     * Main method to test the Library Application
     */
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");
        
        // Initialize the library with 3 available books
        Library library = new Library(3);
        System.out.println();
        
        // First issue: 2 books (valid)
        try {
            System.out.println("--- Attempting to issue 2 books ---");
            library.issueBook(2);
            System.out.println();
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }
        
        // Second issue: 2 more books (should throw exception)
        try {
            System.out.println("--- Attempting to issue 2 more books ---");
            library.issueBook(2);
            System.out.println();
        } catch (BookNotAvailableException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Remaining books in library: " + library.getAvailableBooks());
            System.out.println();
        }
        
        // Display final status
        System.out.println("=== Final Library Status ===");
        library.displayAvailableBooks();
        
        // Additional test cases
        System.out.println("\n--- Additional Test Cases ---");
        
        // Create a new library with 5 books
        Library library2 = new Library(5);
        System.out.println();
        
        // Try issuing 3 books
        try {
            System.out.println("Attempting to issue 3 books...");
            library2.issueBook(3);
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        
        // Try issuing 3 more books (should throw exception)
        try {
            System.out.println("Attempting to issue 3 more books...");
            library2.issueBook(3);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Remaining books: " + library2.getAvailableBooks());
        }
    }
}
