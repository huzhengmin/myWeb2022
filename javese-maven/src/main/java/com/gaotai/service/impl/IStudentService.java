package com.gaotai.service.impl;

import com.gaotai.entity.StudentTemp;

import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/24 15:25
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public interface IStudentService {
    StudentTemp getStudent();
    void addStudent();
    void deleteStudent();
    List<StudentTemp> getStudentList();
}
