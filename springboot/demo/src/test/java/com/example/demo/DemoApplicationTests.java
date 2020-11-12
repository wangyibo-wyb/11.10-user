package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserRepository repository;
    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        User user = new User();
        user.setUser_name("李四");
        user.setLogin_name("123");
        user.setPwd("123");
        User user1 = repository.save(user);
        System.out.println(user1);
    }

    @Test
    void findById(){
        User user = repository.findById(1).get();
        System.out.println(user);
    }

    @Test
    void update(){
        User user = new User();
        user.setUser_id(1);
        user.setUser_name("张三三");
        User user1 = repository.save(user);
        System.out.println(user1);
    }

}
