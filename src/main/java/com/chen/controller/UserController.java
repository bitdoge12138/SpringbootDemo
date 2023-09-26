package com.chen.controller;


import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;



    @RequestMapping("/{id}")
    void getById(@PathVariable Long id) {

        User user = userService.getById(id);

        System.out.println(user);
    }







}
