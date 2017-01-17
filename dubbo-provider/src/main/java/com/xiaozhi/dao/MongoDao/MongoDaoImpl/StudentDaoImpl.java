package com.xiaozhi.dao.MongoDao.MongoDaoImpl;

import com.xiaozhi.dao.MongoDao.StudentDao;
import com.xiaozhi.model.StudentDo;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by huangzh on 2017/1/16.
 */
@Component
public class StudentDaoImpl implements StudentDao {

    @Resource
    private Datastore datastore;
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void addStudent(StudentDo studentDo) {
        if (studentDo != null) {
            studentDo.setCreateTime(dateFormat.format(new Date()));
            studentDo.setModifyTime(dateFormat.format(new Date()));
            datastore.save(studentDo);
        }
    }

    public void updateStudent(StudentDo studentDo) {
        if (studentDo != null) {
            Query<StudentDo> oldClickEvent = datastore.createQuery(StudentDo.class)
                    .field("sid").equal(studentDo.getSid());
            UpdateOperations<StudentDo> newClickEvent = datastore.createUpdateOperations(StudentDo.class)
                    .set("sname", studentDo.getSname())
                    .set("spassword", studentDo.getSpassword())
                    .set("modifyTime", dateFormat.format(new Date()));
            datastore.updateFirst(oldClickEvent, newClickEvent);
        }
    }

    public List<StudentDo> findStudent(StudentDo studentDo) {
        if (studentDo != null) {
            Query<StudentDo> query = datastore.createQuery(StudentDo.class);
            //query.criteria("sid").equal(studentDo.getSid());
            query.field("sid").equal(studentDo.getSid());  //两者区别？？
//            query.criteria("status").equal(NotifyConstants.VALID);
            return query.asList();
        } else {
            return null;
        }

    }

    public void deleteStudent(StudentDo studentDo) {
        if(studentDo!=null){
            Query<StudentDo> query=datastore.createQuery(StudentDo.class);
            query.field("sid").equal(studentDo.getSid());
            datastore.findAndDelete(query);
        }
    }
}
