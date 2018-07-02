package com.ant.example.service;

import com.ant.example.model.User;

import java.util.List;

public interface IUserService {

    User add(User user);
    User update(User user);
    void delete(Long id);
    List<User> list();
}
