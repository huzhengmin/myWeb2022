package com.gaotai.service.impl.impl;

import com.gaotai.service.impl.IStudentService;
import com.sun.org.apache.bcel.internal.generic.IFNULL;
import junit.framework.TestCase;

/**
 * @author： hzm
 * @date： 2022/1/24 15:32
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class StudentServiceTest extends TestCase {

    public void testGetStudentList() {

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false

        Student student = new Student();
        student.studentShow(new StudentService());
        student.studentShow(new StudentService01());
        student.studentShow(new StudentServiceAbs());
        return;
        /*IStudentService studentService = new StudentService();
        studentService.getStudentList();
        studentService =  new StudentService01();
        if(studentService instanceof StudentService01) {
            StudentService01 s = (StudentService01) studentService;
           s.getName();
        }
        else

        {

            System.out.println("null");
        }
        studentService = new StudentServiceAbs();
        studentService.getStudentList();*/
    }
}