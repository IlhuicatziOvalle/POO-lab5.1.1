import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private String title;
    private Author author;
    private String isbn;
    private int publishedYear;
    private boolean available;

    public Book(int id, String title, Author author, String isbn, int publishedYear, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", publishedYear=" + publishedYear +
                ", available=" + available +
                '}';
    }
}
