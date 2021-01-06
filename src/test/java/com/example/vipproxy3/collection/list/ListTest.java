package com.example.vipproxy3.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/*
 @Description
 *@author kang.li
 *@date 2021/1/5 9:17   
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        System.out.println("=========================");
        UnaryOperator operator = new MyOperator();
        list.replaceAll(operator);
        System.out.println(list);
    }
}
