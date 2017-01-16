package com.xiaozhi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by huangzh on 2017/1/13.
 */
@Data
@AllArgsConstructor
public class UserVo {
    private Integer uid;
    private String uname;
    private String upasseord;
    private String createTime;
    private String modifyTime;
}
