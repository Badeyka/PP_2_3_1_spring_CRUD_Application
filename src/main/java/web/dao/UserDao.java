package web.dao;


import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(int id);

    void save(User user);

    void update(User user);

    void delete(int id);
}
