package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Long id);
    void create(User user);
    void update(User user);
    void delete(Long id);
}