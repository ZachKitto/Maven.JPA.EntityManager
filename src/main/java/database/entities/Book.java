package database.entities;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private long authorId;
    private int pages;
    private String genre;

    @ManyToOne
    private Author author;

    public Book() {
    }

    public Book(long id, String title, long authorId, int pages, String genre) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.pages = pages;
        this.genre = genre;
    }

    public Book(String title, long authorId, int pages, String genre) {
        this.title = title;
        this.authorId = authorId;
        this.pages = pages;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
