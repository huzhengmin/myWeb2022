package com.gaotai.entity;

/**
 * @author： hzm
 * @date： 2022/1/24 15:17
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class StudentTemp extends  People{
    private  String classCode;

    @Override
    public String toString() {
        return super.toString() +"Student{" +
                "classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                '}';

    }

    private  String className;

    public StudentTemp(int id, String name, int age, String classCode, String className) {
        super(id, name, age);
        this.classCode = classCode;
        this.className = className;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
