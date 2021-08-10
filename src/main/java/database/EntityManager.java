package database;

import javax.persistence.*;

public interface EntityManager {

    @PersistenceUnit
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("MyUnit");
    @PersistenceContext
    javax.persistence.EntityManager manager = managerFactory.createEntityManager();
}
