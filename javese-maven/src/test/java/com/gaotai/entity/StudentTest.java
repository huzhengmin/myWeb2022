package com.gaotai.entity;

import junit.framework.TestCase;

/**
 * @author： hzm
 * @date： 2022/1/24 15:21
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class StudentTest extends TestCase {
    public void test01()
    {
        StudentTemp student = new StudentTemp(1,"张开",21,"250064123","三级级一班");
        System.out.println(student);
    }
}