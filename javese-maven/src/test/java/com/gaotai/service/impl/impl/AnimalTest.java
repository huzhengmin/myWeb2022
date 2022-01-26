package com.gaotai.service.impl.impl;

import com.gaotai.entity.Cat;
import com.gaotai.entity.Dog;
import junit.framework.TestCase;

/**
 * @author： hzm
 * @date： 2022/1/25 11:09
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class AnimalTest extends TestCase {

    public void testFeed() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Animal();
        animal.feed(cat);
        animal.feed(dog);
    }
}