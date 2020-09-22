package com.example.demo.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-10 13:46
 **/
@Component("user1")
public class User {
    @Value("${hello}")
    private String userName;

    public User() {
        System.out.println("user: 构造函数");

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
