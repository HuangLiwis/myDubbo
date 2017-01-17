package com.xiaozhi.dao.MySqlDao;

import com.xiaozhi.model.UserDo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by huangzh on 2017/1/13.
 */
@Repository
public interface UserDao {
    public void addUser(UserDo userdo);
    public void updateUser(UserDo userdo);
    public List<UserDo> findUser(UserDo userdo);
    public void deleteUser(Integer uid);
}
