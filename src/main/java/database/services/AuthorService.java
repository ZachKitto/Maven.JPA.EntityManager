package database.services;

import database.EntityManager;
import database.entities.Author;

import java.util.List;


public class AuthorService implements EntityManager {

    public Author findById(Long id) {
        return manager.find(Author.class, id);
    }

    public List<Author> findAll() {
        return manager.createQuery("SELECT * FROM Author").getResultList();
    }

    public Author update(Long id, Author authorData) {
        manager.getTransaction().begin();
        Author newAuthor = findById(id);
        newAuthor.setFirstName(authorData.getFirstName());
        newAuthor.setLastName(authorData.getLastName());
        newAuthor.setNumberOfBooksWritten(authorData.getNumberOfBooksWritten());
        manager.persist(newAuthor);
        manager.getTransaction().commit();
        return newAuthor;
    }

    public Author create(Author newAuthor) {
        manager.getTransaction().begin();
        manager.persist(newAuthor);
        manager.getTransaction().commit();
        return newAuthor;
    }

    public Author delete(Author authorToDelete) {
        manager.getTransaction().begin();
        manager.remove(authorToDelete);
        manager.getTransaction().commit();
        return authorToDelete;
    }
}
