package com.ant.example.controller;

import com.ant.example.bean.Rest;
import com.ant.example.model.User;
import com.ant.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhougaojun
 * @since 2018-07-02 下午4:18
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping("/list")
    public Rest list() {
        return Rest.success().data(userService.list());
    }

    @PostMapping("/add")
    public Rest add(User user) {
        return Rest.success().data(userService.add(user));
    }

    @PutMapping("/update")
    public Rest update(User user) {
        return Rest.success().data(userService.update(user));
    }

    @DeleteMapping("/delete")
    public Rest list(Long id) {
        userService.delete(id);
        return Rest.success();

    }
}

 