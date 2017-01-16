package com.xiaozhi.service;

import com.xiaozhi.model.User;

import java.util.List;

/**
 * Created by huangzh on 2017/1/13.
 */
public interface UserService {
    public void saveUser(User user);
    public void modifyUser(User user);
    public List<User> queryUser(User user);
    public void removeUser(Integer uid);
}
