package com.caihao.springboot.controller;

import com.caihao.springboot.entity.User;
import com.caihao.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author CaiHao
 * @create 2019-08-25 11:41:46
 */

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/user/{id}")
    public Optional<User> getUserById(@PathVariable(value = "id",required = false) Integer id){

        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @GetMapping("/user")
    public User addUser(User user){

        User user1 = userRepository.save(user);
        return user1;
    }


}
