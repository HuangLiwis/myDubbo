package com.xiaozhi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by huangzh on 2017/1/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable{
    private Integer sid;
    private String sname;
    private String spassword;
    private String createTime;
    private String modifyTime;
}
