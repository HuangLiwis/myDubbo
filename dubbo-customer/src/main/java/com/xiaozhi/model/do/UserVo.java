package com.xiaozhi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by huangzh on 2017/1/13.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
    private Integer uid;
    private String uname;
    private String upasseord;
    private String createTime;
    private String modifyTime;
}
