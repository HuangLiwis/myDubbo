package com.xiaozhi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;

/**
 * Created by huangzh on 2017/1/16.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(value = "student", noClassnameStored = true)
public class StudentDo implements Serializable {
    @Id
    private ObjectId id;
    private Integer sid;
    private String sname;
    private String spassword;
    private String createTime;
    private String modifyTime;
}
