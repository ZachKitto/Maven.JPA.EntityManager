package database.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private int numberOfBooksWritten;

    @OneToMany
    private Set<Book> books = new HashSet<Book>();

    public Author() {
    }

    public Author(long id, String firstName, String lastName, int numberOfBooksWritten) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

    public Author(String firstName, String lastName, int numberOfBooksWritten) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfBooksWritten() {
        return numberOfBooksWritten;
    }

    public void setNumberOfBooksWritten(int numberOfBooksWritten) {
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
