package com.xiaozhi.dao.MongoDao;

import com.xiaozhi.model.StudentDo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangzh on 2017/1/16.
 */
@Service
public interface StudentDao {
    public void addUser(StudentDo studentDo);
    public void updateUser(StudentDo studentDo);
    public List<StudentDo> findUser(StudentDo studentDo);
    public void deleteUser(StudentDo studentDo);
}
