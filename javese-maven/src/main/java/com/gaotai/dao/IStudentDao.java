package com.gaotai.dao;

import com.gaotai.entity.Student;

import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/25 18:48
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public interface IStudentDao {
    List<Student> selectStudents ();
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(int id);
}
