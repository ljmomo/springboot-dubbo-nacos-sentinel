package com.lvzhu.user.client;

import com.lvzhu.user.api.UserService;
import com.lvzhu.user.resp.User;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


/**
 * @author lvzhu.
 * Time 2019-08-05 20:17
 * Desc 文件描述
 */
@Service
public class UserClient {

    @Reference(loadbalance = "roundrobin", cluster = "failfast", check = false,mock = "com.lvzhu.user.client.UserClientMock")
    private UserService userService;

    public User getUser(Long id) {
        return userService.getUser(id);
    }
}
