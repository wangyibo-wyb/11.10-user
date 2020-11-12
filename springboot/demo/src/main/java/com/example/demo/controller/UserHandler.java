package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    //获取全部用户
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    //通过用户id获取单个用户
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }

    //创建用户
    @PostMapping("/user")
    public String save(@RequestBody User user){
        User result = userRepository.save(user);
        if(result != null){
            return "创建成功";
        }else {
            return "创建失败";
        }
    }

    //修改指定用户信息
    @PutMapping("/user")
    public String update(@RequestBody User user){
        User result = userRepository.save(user);
        if(result != null){
            return "成功";
        }else {
            return "失败";
        }
    }

    //删除指定用户
    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
}
