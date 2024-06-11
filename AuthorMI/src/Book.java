public class Book {
    private int id;
    private String title;
    private int authorId;
    private int year;

    public Book(int id, String title, int authorId, int year) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
