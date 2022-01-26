package com.gaotai;

import com.gaotai.dao.IStudentDao;
import com.gaotai.dao.impl.impl.StudentDao;
import com.gaotai.entity.Student;
import com.gaotai.utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/24 15:13
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class MavenBatisMain {
    public static void main(String[] args) {
//        ResourceBundle bundle = ResourceBundle.getBundle("test");
//
//        String value = bundle.getString("key");
//        System.out.println(value);

        //1.mybatis 主配置文件
        String config = "mybatis.xml";
//2. 读取配置文件
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
//3. 创建 SqlSessionFactory 对象, , 目的是获取  Sql Session
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//4. 获取 SqlSession,SqlSession 能执行 sql 语句
        SqlSession session = factory.openSession();
//5. 执行 SqlSession 的 selectList()
        List<Student> studentList = session.selectList("com.gaotai.dao.IStudentDao.selectStudents");
//6. 循环输出查询结果
        studentList.forEach(student -> System.out.println(student));
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//7. 关闭 SqlSession ，释放资源
        session.close();
    }

    @Test
    public void testInsert() throws IOException {
//1.mybatis 主配置文件
        String config = "mybatis.xml";
//2. 读取配置文件
        InputStream in = Resources.getResourceAsStream(config);
//3. 创建 SqlSessionFactory 对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//4. 获取 SqlSession
        SqlSession session = factory.openSession();
//5. 创建保存数据的对象
        Student student = new Student();
        student.setId(1005);
        student.setName(" 张丽");
        student.setEmail("zhangli@163.com");
        student.setAge(20);
//6. 执行插入 insert
        int rows = session.insert(
                "com.gaotai.dao.IStudentDao.insertStudent", student);
//7. 提交事务
        session.commit();
        System.out.println(" 增加记录的行数:" + rows);
//8. 关闭 SqlSession
        session.close();
    }

    @Test
    public void testUpdate() throws IOException {
//1.mybatis 主配置文件
        String config = "mybatis.xml";
//2. 读取配置文件
        InputStream in = Resources.getResourceAsStream(config);
//3. 创建 SqlSessionFactory 对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//4. 获取 SqlSession
        SqlSession session = factory.openSession();
//5. 创建保存数据的对象
        Student student = new Student();
        student.setId(1005);// 要修改的 id
        student.setAge(30); // 要修改的年龄值
//6. 执行 更新 update
        int rows = session.update(
                "com.gaotai.dao.IStudentDao.updateStudent", student);
//7. 提交事务
        session.commit();
        System.out.println(" 修改记录的行数:" + rows);
//8. 关闭 SqlSession
        session.close();
    }

    @Test
    public void testDelete() throws IOException {
//1.mybatis 主配置文件
        String config = "mybatis.xml";
//2. 读取配置文件
        InputStream in = Resources.getResourceAsStream(config);
//3. 创建 SqlSessionFactory 对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//4. 获取 SqlSession
        SqlSession session = factory.openSession();
//5. 删除的 id
        int id = 1;
//6. 执行删除 delete
        int rows = session.delete(
                "com.gaotai.dao.IStudentDao.deleteStudent", id);
//7. 提交事务
        session.commit();
        System.out.println(" 修改记录的行数:" + rows);

//8. 关闭 SqlSession
        session.close();
    }

    @Test
    public void testUtils() throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        List<Student> studentList = session.selectList(
                "com.gaotai.dao.IStudentDao.selectStudents");
        //studentList.forEach( student -> System.out.println(student));
        studentList.forEach(System.out::println);
        session.close();
    }

    @Test
    public void testStuList() {
        System.out.println("------------------->testStuList()");
        IStudentDao studentDao = new StudentDao();
        List<Student> studentList = studentDao.selectStudents();
        studentList.forEach(System.out::println);
    }

    @Test
    public void testStuUpdate() {
        System.out.println("------------------->testStuUpdate()");
        IStudentDao studentDao = new StudentDao();
        Student student = new Student();
        student.setId(1005);
        student.setName("张飞");
        System.out.println(studentDao.updateStudent(student));

    }

    @Test
    public void testStuInsert() {
        System.out.println("------------------->testStuInsert()");
        IStudentDao studentDao = new StudentDao();
        Student student = new Student();
        student.setId(1006);
        student.setName("张飞3");
        student.setAge(123);
        System.out.println(studentDao.insertStudent(student));

    }

    @Test
    public void testStuDelete() {
        System.out.println("------------------->testStuDelete()");
        IStudentDao studentDao = new StudentDao();
        System.out.println(studentDao.deleteStudent(1006));
    }
}
