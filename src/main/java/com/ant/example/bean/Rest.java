package com.ant.example.bean;

import lombok.*;

/**
 * @author zhougaojun
 * @since 2018-07-02 下午4:19
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rest {

    private boolean success;
    private int code;
    private String message;
    private Object data;

    public static Rest success(){
        return new Rest(true,200,null,null);
    }

    public static Rest failure(String message){
        return new Rest(false,500,message,null);
    }

    public  Rest data(Object data){
        this.data = data;
        return this;
    }
}

 