package com.xiaozhi.serviceImp;

import com.xiaozhi.dao.MySqlDao.UserDao;
import com.xiaozhi.model.User;
import com.xiaozhi.model.UserDo;
import com.xiaozhi.service.UserService;
import com.xiaozhi.utils.BeanKit;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangzh on 2017/1/13.
 */

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    public void saveUser(User user) {
        UserDo userDo=new BeanKit<UserDo,User>().Ro2Po(UserDo.class,user);
        userDao.addUser(userDo);
    }

    public void modifyUser(User user) {
        UserDo userDo=new BeanKit<UserDo,User>().Ro2Po(UserDo.class,user);
        userDao.updateUser(userDo);
    }

    public List<User> queryUser(User user) {
        UserDo userDo=new BeanKit<UserDo,User>().Ro2Po(UserDo.class,user);
        System.out.println("userid:"+userDo.getUid());
        List<UserDo> userDos=userDao.findUser(userDo);
        List<User> users=new ArrayList<User>();
        for (UserDo userDo1:userDos){
            users.add(new BeanKit<User,UserDo>().Ro2Po(User.class,userDo1));
        }
        return users;
    }

    public void removeUser(Integer uid) {
        userDao.deleteUser(uid);
    }
}
