package com.xiaozhi.serviceImp;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * Created by huangzh on 2017/1/16.
 */
public class StudentServiceImpl {
    MongoClient mongoClient=new MongoClient("localhost" , 27017);
    Mongo mongo=new Mongo("");
    public void test(){
    }
}
