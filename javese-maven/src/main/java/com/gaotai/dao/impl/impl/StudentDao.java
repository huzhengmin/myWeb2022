package com.gaotai.dao.impl.impl;

import com.gaotai.dao.IStudentDao;
import com.gaotai.entity.Student;
import com.gaotai.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/26 10:18
 * @description： TODO
 * @modifiedBy：
 * @version: 在前面例子中自定义 Dao 接口实现类时发现一个问题：Dao 的实现类其实并没有干什么实质性的工
 * 作，它仅仅就是通过 SqlSession 的相关 API 定位到映射文件 mapper 中相应 id 的 SQL 语句，真正对 DB 进
 * 行操作的工作其实是由框架通过 mapper 中的 SQL 完成的。
 * 所以，MyBatis 框架就抛开了 Dao 的实现类，直接定位到映射文件 mapper 中的相应 SQL 语句，对
 * DB 进行操作。这种对 Dao 的实现方式称为 Mapper 的动态代理方式。
 * Mapper 动态代理方式无需程序员实现 Dao 接口。接口是由 MyBatis 结合映射文件自动生成的动态代
 * 理实现的。
 */
public class StudentDao implements IStudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession session = MyBatisUtil.getSqlSession();
        List<Student> studentList = session.selectList(
                "com.gaotai.dao.IStudentDao.selectStudents");
        session.close();
        return studentList;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession session = MyBatisUtil.getSqlSession();
        int nums = session.insert(
                "com.gaotai.dao.IStudentDao.insertStudent", student);
        session.commit();
        session.close();
        return nums;

    }

    @Override
    public int updateStudent(Student student) {
        SqlSession session = MyBatisUtil.getSqlSession();
        int nums = session.update(
                "com.gaotai.dao.IStudentDao.updateStudent", student);
        session.commit();
        session.close();
        return nums;
    }

    @Override
    public int deleteStudent(int id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        int nums = session.delete(
                "com.gaotai.dao.IStudentDao.deleteStudent", id);
        session.commit();
        session.close();
        return nums;
    }
}
