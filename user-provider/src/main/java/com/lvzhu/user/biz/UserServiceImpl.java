package com.lvzhu.user.biz;

import com.lvzhu.user.api.UserService;
import com.lvzhu.user.resp.User;

import org.apache.dubbo.config.annotation.Service;


/**
 * @author lvzhu.
 * Time 2019-08-05 18:16
 * Desc 文件描述
 */
@Service(loadbalance = "random",cluster = "failsafe")
public class UserServiceImpl implements UserService {

    /**
     * 获取用户信息
     */
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setAge(2+id.intValue());
        user.setUserName("LVZHU"+id);
        user.setId(id);
        System.out.println("Come in getUser()");
        return user;
    }
}
