package com.lvzhu.user.controller;

import com.lvzhu.user.client.UserClient;
import com.lvzhu.user.resp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lvzhu.
 * Time 2019-08-05 20:17
 * Desc 文件描述
 */
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {
        return userClient.getUser(id);
    }
}
