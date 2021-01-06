package com.example.vipproxy3.proxy;

import java.lang.reflect.Proxy;

/*
 @Description
 *@author kang.li
 *@date 2021/1/5 14:06   
 */
public class ProxyTest {
    public static void main(String[] args) {
        Student student = new Student("bob");
        StuInvocationHandler<Person> stuHandler = new StuInvocationHandler<>(student);
        Person stuProxy = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);
        stuProxy.giveMoney();
    }

}
