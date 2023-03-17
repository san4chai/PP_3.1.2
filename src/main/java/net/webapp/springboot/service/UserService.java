package net.webapp.springboot.service;

import net.webapp.springboot.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    public User saveUser(User user);

    public void deleteById(Long id);

}
