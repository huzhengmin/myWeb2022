package com.gaotai.service.impl.impl;

import com.gaotai.entity.StudentTemp;
import com.gaotai.service.impl.IStudentService;

import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/24 15:31
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class        StudentService01  implements IStudentService {
    @Override
    public StudentTemp getStudent() {
        return null;
    }

    @Override
    public void addStudent() {

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public List<StudentTemp> getStudentList() {
        System.out.println("取的学生List");
        return null;
    }
    public void  getName()
    {
        System.out.println("myName");

    }
}
