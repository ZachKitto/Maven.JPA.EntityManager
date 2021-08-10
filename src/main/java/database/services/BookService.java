package database.services;

import database.EntityManager;
import database.entities.Book;

import java.util.List;


public class BookService implements EntityManager {

    public Book findById(Long id) {
        return manager.find(Book.class, id);
    }

    public List<Book> findAll() {
        return manager.createQuery("SELECT * FROM BOOK").getResultList();
    }

    public Book update(Long id, Book bookData) {
        manager.getTransaction().begin();
        Book newBook = findById(id);
        newBook.setAuthor(bookData.getAuthor());
        newBook.setAuthorId(bookData.getAuthorId());
        newBook.setGenre(bookData.getGenre());
        newBook.setPages(bookData.getPages());
        newBook.setTitle(bookData.getTitle());
        manager.persist(newBook);
        manager.getTransaction().commit();
        return newBook;
    }

    public Book create(Book newBook) {
        manager.getTransaction().begin();
        manager.persist(newBook);
        manager.getTransaction().commit();
        return newBook;
    }

    public Book delete(Book bookToDelete) {
        manager.getTransaction().begin();
        manager.remove(bookToDelete);
        manager.getTransaction().commit();
        return bookToDelete;
    }

}
