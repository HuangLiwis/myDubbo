package com.xiaozhi.controller;

import com.xiaozhi.model.Student;
import com.xiaozhi.model.User;
import com.xiaozhi.service.StudentService;
import com.xiaozhi.service.UserService;
import com.xiaozhi.service.XiaozhiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by huangzh on 2016/12/29.
 */
@Controller
public class MyController {
    @Resource
    private XiaozhiService xiaozhiService;
    @Resource
    private UserService userService;
    @Resource
    private StudentService studentService;


    @RequestMapping("/test")
    public String mytest(HttpServletRequest request) {

        request.getSession().setAttribute("msg", xiaozhiService.sayHello("调用来自api的接口"));
        User user = new User();
        user.setUid(1);
        User userlist = userService.queryUser(user).get(0);
        request.getSession().setAttribute("user", userlist);

        Student findStudent = new Student();
        findStudent.setSid(1);
        Student student = studentService.findStudent(findStudent).get(0);
        request.getSession().setAttribute("student", student);
        return "succeed";
    }
}
