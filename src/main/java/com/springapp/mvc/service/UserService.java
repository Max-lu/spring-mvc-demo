package com.springapp.mvc.service;

import com.springapp.mvc.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);

}