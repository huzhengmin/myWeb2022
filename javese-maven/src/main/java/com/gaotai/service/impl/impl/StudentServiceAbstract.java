package com.gaotai.service.impl.impl;

import com.gaotai.entity.StudentTemp;
import com.gaotai.service.impl.IStudentService;

import java.util.List;

/**
 * @author： hzm
 * @date： 2022/1/24 15:48
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public abstract class StudentServiceAbstract  implements IStudentService {

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
    abstract public List<StudentTemp> getStudentList()  ;

}
