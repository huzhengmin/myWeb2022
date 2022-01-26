package com.gaotai.service.impl.impl;

import com.gaotai.entity.StudentTemp;
import com.gaotai.service.impl.IStudentService;

import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/24 15:26
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class StudentService implements IStudentService {
    @Override
    public StudentTemp getStudent() {
        return null;
    }

    @Override
    public void addStudent() {
        System.out.println("增加成功");
    }

    @Override
    public void deleteStudent() {
        System.out.println("删除成功");
    }

    @Override
    public List<StudentTemp> getStudentList() {
        System.out.println("取的List成功");
        return null;
    }
}
