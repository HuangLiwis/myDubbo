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
    * Method: addStudent(StudentDo studentDo)
    *
    */
    @Test
    public void testAddStudent() throws Exception {
        studentDao.addStudent(studentDo);
    }

    /**
    *
    * Method: updateStudent(StudentDo studentDo)
    *
    */
    @Test
    public void testUpdateStudent() throws Exception {
        studentDao.updateStudent(studentDo);
    }

    /**
    *
    * Method: findStudent(StudentDo studentDo)
    *
    */
    @Test
    public void testFindStudent() throws Exception {
        StudentDo studentDo=new StudentDo();
        studentDo.setSid(1);
        List<StudentDo> list= studentDao.findStudent(studentDo);
        System.out.print(list.get(0));
    }

    /**
    *
    * Method: deleteStudent(StudentDo studentDo)
    *
    */
    @Test
    public void testDeleteStudent() throws Exception {
        StudentDo studentDo=new StudentDo();
        studentDo.setSid(3);
        studentDao.deleteStudent(studentDo);
    }


} 
