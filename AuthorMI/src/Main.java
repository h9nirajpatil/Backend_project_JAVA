import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorDao authorDao = new AuthorDao();
        BookDao bookDao = new BookDao();

        // Add some authors
        Author author1 = authorDao.addAuthor("Jane Austen", "jane.austen@example.com");
        Author author2 = authorDao.addAuthor("Charles Dickens", "charles.dickens@example.com");

        // Add some books
        Book book1 = bookDao.addBook("Pride and Prejudice", author1.getId(), 1813);
        Book book2 = bookDao.addBook("Sense and Sensibility", author1.getId(), 1811);
        Book book3 = bookDao.addBook("David Copperfield", author2.getId(), 1850);

        // Update an author
        author1.setName("Jane Austen Smith");
        authorDao.updateAuthor(author1);

        // Update a book
        book1.setTitle("Pride and Prejudice and Zombies");
        bookDao.updateBook(book1);

        // Delete a book
        bookDao.deleteBook(book3.getId());

        // Get all authors
        List<Author> authors = authorDao.getAllAuthors();
        System.out.println("All authors:");
        for (Author author : authors) {
            System.out.println(author.getName());
        }

        // Get all books
        List<Book> books = bookDao.getAllBooks();
        System.out.println("All books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + authorDao.getAuthor(book.getAuthorId()).getName());
        }

        // Get books by author
        List<Book> authorBooks = bookDao.getBooksByAuthor(author1.getId());
        System.out.println("Books by Jane Austen:");
        for (Book book : authorBooks) {
            System.out.println(book.getTitle());
        }
    }
}
