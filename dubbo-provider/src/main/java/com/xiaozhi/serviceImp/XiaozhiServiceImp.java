package com.xiaozhi.serviceImp;

import com.xiaozhi.service.XiaozhiService;
import org.springframework.stereotype.Service;

/**
 * Created by huangzh on 2016/12/29.
 */

@Service("xiaozhiServiceImp")
public class XiaozhiServiceImp implements XiaozhiService{
    public String sayHello(String name) {
        System.out.println("HELLO");
        return name;
    }
}
