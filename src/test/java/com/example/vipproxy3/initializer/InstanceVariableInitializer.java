package com.example.vipproxy3.initializer;

/*
 @Description 类的初始化
    第1执行，静态成员变量
    第2执行，静态代码块
    第3执行成员变量
    第4执行代码块
 *@author kang.li
 *@date 2021/1/4 10:00   
 */
public class InstanceVariableInitializer {
    private int i = 1;
    private static int j = 2;

    public InstanceVariableInitializer(int var){
        System.out.println(i);
        System.out.println(j);
        this.i = var;
        System.out.println(i);
        System.out.println(j);
    }

    {
        j += 3;
    }

    static {
        j += 1;
    }
    public static void main(String[] args) {
        new InstanceVariableInitializer(8);
    }
}
