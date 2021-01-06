package com.example.vipproxy3.threadlocal;

/*
 @Description 注意: ThreadLocal不是用来解决多线程下访问共享变量问题的
              在Thread类里面有一个ThreadLocalMap，用于存储每一个线程的变量的引用，这个Map中的键为ThreadLocal对象，
              而值对应的是ThreadLocal通过set放进去的变量引用
 *@author kang.li
 *@date 2021/1/5 14:49   
 */
public class ThreadLocalTest {
    public static void main(String[] args) throws InterruptedException{
        Target target = new Target();
        Thread thread = new Thread(target);
        thread.start();
        thread.join();
        System.out.println("线程" + Thread.currentThread().getName() + "中共享变量Person的名字：" + target.getPerson().getName());
    }
}
