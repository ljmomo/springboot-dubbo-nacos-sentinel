package com.lvzhu.user.resp;

import java.io.Serializable;


/**
 * @author lvzhu.
 * Time 2019-08-05 13:59
 * Desc 文件描述
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1008450983070357113L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }
}
