package com.xiaozhi.serviceImp;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.xiaozhi.dao.MongoDao.StudentDao;
import com.xiaozhi.model.Student;
import com.xiaozhi.model.StudentDo;
import com.xiaozhi.service.StudentService;
import com.xiaozhi.utils.BeanKit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangzh on 2017/1/16.
 */
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentDao studentDao;

    public void addStudent(Student student) {
        StudentDo studentDo = new BeanKit<StudentDo, Student>().Ro2Po(StudentDo.class, student);
        studentDao.addStudent(studentDo);
    }

    public void updateStudent(Student student) {
        StudentDo studentDo = new BeanKit<StudentDo, Student>().Ro2Po(StudentDo.class, student);
        studentDao.updateStudent(studentDo);
    }

    public List<Student> findStudent(Student student) {
        StudentDo studentDo = new BeanKit<StudentDo, Student>().Ro2Po(StudentDo.class, student);
        List<StudentDo> dos = studentDao.findStudent(studentDo);
        List<Student> students = new ArrayList<Student>();
        for (StudentDo studentDo1 : dos) {
            Student student1 = new BeanKit<Student, StudentDo>().Ro2Po(Student.class, studentDo1);
            students.add(student1);
        }
        return students;
    }

    public void deleteStudent(Student student) {
        StudentDo studentDo = new BeanKit<StudentDo, Student>().Ro2Po(StudentDo.class, student);
        studentDao.deleteStudent(studentDo);
    }
}
