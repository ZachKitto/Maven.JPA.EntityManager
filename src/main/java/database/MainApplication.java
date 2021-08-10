package database;

import database.entities.Author;
import database.entities.Book;
import database.services.AuthorService;
import database.services.BookService;

//@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        AuthorService authorService = new AuthorService();
        Book book1 = new Book("Lord of the Rings", 1, 1137, "Fantasy");
        Author author1 = new Author("John Ronald Reuel", "Tolkien", 23);

        authorService.create(author1);
        bookService.create(book1);
    }
}
