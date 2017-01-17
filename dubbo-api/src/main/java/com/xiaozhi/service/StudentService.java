package com.xiaozhi.service;

import com.xiaozhi.model.Student;

import java.util.List;

/**
 * Created by huangzh on 2017/1/17.
 */
public interface StudentService {
     void addStudent(Student student);
     void updateStudent(Student student);
     List<Student> findStudent(Student student);
     void deleteStudent(Student student);
}
