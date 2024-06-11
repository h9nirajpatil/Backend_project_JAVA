import java.util.ArrayList;
import java.util.List;

public class AuthorDao {
    private List<Author> authors = new ArrayList<>();
    private int nextId = 1;

    public Author addAuthor(String name, String email) {
        Author author = new Author(nextId++, name, email);
        authors.add(author);
        return author;
    }

    public void updateAuthor(Author author) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getId() == author.getId()) {
                authors.set(i, author);
                return;
            }
        }
    }

    public void deleteAuthor(int id) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getId() == id) {
                authors.remove(i);
                return;
            }
        }
    }

    public Author getAuthor(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public List<Author> getAllAuthors() {
        return authors;
    }
}
