package com.gaotai;

import com.gaotai.dao.IStudentDao;
import com.gaotai.entity.Student;
import com.gaotai.utils.MyBatisUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/26 10:50
 * @description： TODO
 * @modifiedBy：
 * @version: 章 MyBatis  框架 Dao  代理
 */
public class MyBatisMainAgent {
    @Test
    public void testSelect() {
        //        只需调用 SqlSession 的 getMapper()方法，即可获取指定接口的实现类对象。该方法的参数为指定 Dao
        //        接口类的 class 值。
        //        org.apache.ibatis.session.SqlSession session = factory.openSession();
        //        StudentDao dao = session.getMapper(StudentDao.class);
        //        使用工具类:
        IStudentDao studentDao =
                MyBatisUtil.getSqlSession().getMapper(IStudentDao.class);
        List<Student> studentList = studentDao.selectStudents();
        studentList.forEach(stu -> System.out.println(stu));
    }

    @Test
    public void testInsert() {
        //        只需调用 SqlSession 的 getMapper()方法，即可获取指定接口的实现类对象。该方法的参数为指定 Dao
        //        接口类的 class 值。
        //        org.apache.ibatis.session.SqlSession session = factory.openSession();
        //        StudentDao dao = session.getMapper(StudentDao.class);
        //        使用工具类:
        IStudentDao studentDao =
                MyBatisUtil.getSqlSession().getMapper(IStudentDao.class);
        Student student = new Student(1, "大仙", "da@sina.com", 213);
        System.out.println("添加学生-》" + studentDao.insertStudent(student));

    }

    @Test
    public void testUpdate() {

        IStudentDao studentDao =
                MyBatisUtil.getSqlSession().getMapper(IStudentDao.class);
        Student student = new Student(1, "222大仙", "da@sina.com", 213);
        System.out.println("修改学生-》" + studentDao.updateStudent(student));
    }

    @Test
    public void testDelete() {
        IStudentDao studentDao =
                MyBatisUtil.getSqlSession().getMapper(IStudentDao.class);
        System.out.println("删除学生-》" + studentDao.deleteStudent(1));
    }
}
