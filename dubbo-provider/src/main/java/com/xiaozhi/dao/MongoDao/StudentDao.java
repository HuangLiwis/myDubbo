package com.xiaozhi.dao.MongoDao;

import com.xiaozhi.model.StudentDo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangzh on 2017/1/16.
 */
@Service
public interface StudentDao {
    public void addStudent(StudentDo studentDo);
    public void updateStudent(StudentDo studentDo);
    public List<StudentDo> findStudent(StudentDo studentDo);
    public void deleteStudent(StudentDo studentDo);
}
