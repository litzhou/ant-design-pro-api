package com.ant.example.repository;

import com.ant.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhougaojun
 * @since 2018-07-02 下午4:09
 **/
public interface UserRepository extends JpaRepository<User,Long> {
}

 