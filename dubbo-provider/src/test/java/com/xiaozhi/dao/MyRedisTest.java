package com.xiaozhi.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * Created by huangzh on 2017/1/18.
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-redis.xml")
public class MyRedisTest {
    @Resource
    Jedis jedis;

    @Test
    public void saveTest(){
        jedis.set("xiaozhi","xiaozhiValue");
    }

    @Test
    public void getTest(){
        String xiaozhi=jedis.get("xiaozhi");
        System.out.println(xiaozhi);
    }
}
