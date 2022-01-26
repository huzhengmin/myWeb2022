package com.gaotai.entity;

/**
 * @author： hzm
 * @date： 2022/1/25 11:01
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Cat implements Animal{
    @Override
    public void feed() {
        System.out.println("猫在吃");
    }
}
