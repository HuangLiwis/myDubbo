package com.xiaozhi.controller;

import com.xiaozhi.model.User;
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
    XiaozhiService xiaozhiService;
    @Resource
    UserService userService;
    @RequestMapping("/test")
    public String mytest(HttpServletRequest request){

        request.getSession().setAttribute("msg",xiaozhiService.sayHello("调用来自api的接口"));
        User user=new User();
        user.setUid(1);
        User userlist=userService.queryUser(user).get(0);
        request.getSession().setAttribute("user",userlist);
        return "succeed";
    }
}
