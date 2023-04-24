package ru.test.katapp.dao;


import ru.test.katapp.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void remove(User user);
    List<User> getUsers();
    void updateUser(User user);
    User getUser(long id);
}
