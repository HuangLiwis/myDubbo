package com.xiaozhi.service;

import com.xiaozhi.model.User;

import java.util.List;

/**
 * Created by huangzh on 2017/1/13.
 */
public interface UserService {
    void saveUser(User user);
    void modifyUser(User user);
    List<User> queryUser(User user);
    void removeUser(Integer uid);
}
