package com.example.vipproxy3.threadlocal;

/*
 @Description Person是共享变量
 *@author kang.li
 *@date 2021/1/5 14:43   
 */
public class Target implements Runnable{
    private  Person person = new Person("张三");
    public Target() {}

    @Override
    public void run() {
        ThreadLocal<Person> threadLocal = new ThreadLocal<>();
        threadLocal.set(person);
        System.out.println("person原本的名字为: " + person.getName());
        threadLocal.get().setName("李四");
        System.out.println("线程" + Thread.currentThread().getName() + "更改ThreadLocal中Person的名字为：" + threadLocal.get().getName());
    }

    public Person getPerson(){
        return person;
    }
}
