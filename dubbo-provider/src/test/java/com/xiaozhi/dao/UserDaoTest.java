package com.xiaozhi.dao;

import com.xiaozhi.model.UserDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserDaoTest {
    @Resource
    UserDao userDao;

    @Test
    public void save(){
        UserDo userDo=new UserDo();
        userDo.setUid(1);
        List<UserDo> userDo1=userDao.findUser(userDo);
        System.out.println(userDo1);
    }
}
