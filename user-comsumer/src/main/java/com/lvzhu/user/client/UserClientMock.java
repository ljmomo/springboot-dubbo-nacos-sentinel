package com.lvzhu.user.client;

import com.lvzhu.user.api.UserService;
import com.lvzhu.user.resp.User;


/**
 * @author lvzhu.
 * Time 2019-08-05 20:41
 * Desc 文件描述
 */
public class UserClientMock implements UserService {

    /**
     * 获取用户信息
     */
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setUserName("被熔断了！");
        return user;
    }
}
