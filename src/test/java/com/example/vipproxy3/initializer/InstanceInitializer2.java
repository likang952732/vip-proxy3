package com.example.vipproxy3.initializer;

/*
 @Description
 *@author kang.li
 *@date 2021/1/4 10:18   
 */
public class InstanceInitializer2 {
    private int j = getI();
    private int i = 1;

    public InstanceInitializer2() {
        i = 2;
    }

    private int getI() {
        return i;
    }

    public static void main(String[] args) {
        InstanceInitializer2 ii = new InstanceInitializer2();
        System.out.println(ii.j);
        System.out.println(ii.i);
    }
}
