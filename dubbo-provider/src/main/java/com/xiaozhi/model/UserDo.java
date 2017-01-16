package com.xiaozhi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by huangzh on 2017/1/13.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDo {
    private Integer uid;
    private String uname;
    private String upassword;
    private String createTime;
    private String modifyTime;
}
