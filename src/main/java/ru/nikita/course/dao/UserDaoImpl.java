package ru.nikita.course.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.nikita.course.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    public void create(User user) {
        entityManager.persist(user);
    }


    public void edit(int id, User user) {
        User userToUpdate = entityManager.find(User.class, id);
        userToUpdate.setName(user.getName());
        userToUpdate.setSurname(user.getSurname());
        userToUpdate.setEmail(user.getEmail());
        entityManager.merge(user);
    }


    public void delete(int id) {
        User userToDelete = entityManager.find(User.class, id);
        entityManager.remove(userToDelete);
    }


    public User show(int id) {
        return entityManager.find(User.class, id);
    }


    public List<User> index() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }
}
