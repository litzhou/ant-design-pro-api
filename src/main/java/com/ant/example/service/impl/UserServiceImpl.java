package com.ant.example.service.impl;

import com.ant.example.model.User;
import com.ant.example.repository.UserRepository;
import com.ant.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhougaojun
 * @since 2018-07-02 下午4:15
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired private UserRepository userRepository;

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
         userRepository.deleteById(id);
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}

 