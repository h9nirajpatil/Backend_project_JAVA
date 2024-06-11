import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public Book addBook(String title, int authorId, int year) {
        Book book = new Book(nextId++, title, authorId, year);
        books.add(book);
        return book;
    }

    public void updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()) {
                books.set(i, book);
                return;
            }
        }
    }

    public void deleteBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                return;
            }
        }
    }

    public Book getBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getBooksByAuthor(int authorId) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthorId() == authorId) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }
}