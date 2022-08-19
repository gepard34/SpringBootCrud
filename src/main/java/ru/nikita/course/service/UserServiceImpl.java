package ru.nikita.course.service;

import org.springframework.stereotype.Service;
import ru.nikita.course.dao.UserDao;
import ru.nikita.course.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    public void edit(int id, User user) {
        userDao.edit(id, user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public User show(int id) {
       return userDao.show(id);
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }
}
