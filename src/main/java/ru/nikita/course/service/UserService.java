package ru.nikita.course.service;

import ru.nikita.course.model.User;

import java.util.List;

public interface UserService {
    void create(User user);
    void edit(int id, User user);
    void delete(int id);
    User show(int id);
    List<User> index();
}
