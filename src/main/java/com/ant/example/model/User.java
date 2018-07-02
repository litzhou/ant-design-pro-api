package com.ant.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhougaojun
 * @since 2018-07-02 下午4:04
 **/
@Data
@Entity
public class User implements Serializable {


    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Column(name = "user_name")
    private String userName;

    @NotBlank
    private String password;

}

 