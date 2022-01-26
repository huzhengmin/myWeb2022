package com.gaotai.service.impl.impl;

import com.gaotai.service.impl.IStudentService;

/**
 * @author： hzm
 * @date： 2022/1/24 17:42
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Student {
    public  void studentShow(IStudentService studentService)
    {
        studentService.getStudentList();
    }
}
