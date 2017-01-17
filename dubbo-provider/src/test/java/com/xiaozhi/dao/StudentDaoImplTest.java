package com.xiaozhi.dao;

import com.xiaozhi.dao.MongoDao.StudentDao;
import com.xiaozhi.model.StudentDo;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/** 
* StudentDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 17, 2017</pre> 
* @version 1.0 
*/
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mongodb.xml")
public class StudentDaoImplTest { 
    @Resource
    StudentDao studentDao;

    StudentDo studentDo;
    @Before
    public void before() throws Exception {
        studentDo=new StudentDo();
        studentDo.setSid(004);
        studentDo.setSname("huangzhi");
        studentDo.setSpassword("huangzhi111");
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: addUser(StudentDo studentDo)
    *
    */
    @Test
    public void testAddUser() throws Exception {
        studentDao.addUser(studentDo);
    }

    /**
    *
    * Method: updateUser(StudentDo studentDo)
    *
    */
    @Test
    public void testUpdateUser() throws Exception {
        studentDao.updateUser(studentDo);
    }

    /**
    *
    * Method: findUser(StudentDo studentDo)
    *
    */
    @Test
    public void testFindUser() throws Exception {
        StudentDo studentDo=new StudentDo();
        studentDo.setSid(1);
        List<StudentDo> list= studentDao.findUser(studentDo);
        System.out.print(list.get(0));
    }

    /**
    *
    * Method: deleteUser(StudentDo studentDo)
    *
    */
    @Test
    public void testDeleteUser() throws Exception {
        StudentDo studentDo=new StudentDo();
        studentDo.setSid(3);
        studentDao.deleteUser(studentDo);
    }


} 
