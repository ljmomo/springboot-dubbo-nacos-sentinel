package com.lvzhu.user.api;

import com.lvzhu.user.resp.User;


/**
 * @author lvzhu.
 * Time 2019-08-05 13:58
 * Desc 文件描述
 */
public interface UserService {

    /**
     *
     * 获取用户信息
     * @param id
     * @return
     */
   User getUser(Long id);
}
