package com.example.vipproxy3.threadlocal;

/*
 @Description
 *@author kang.li
 *@date 2021/1/5 14:43   
 */
public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
