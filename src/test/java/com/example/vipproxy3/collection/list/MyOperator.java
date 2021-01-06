package com.example.vipproxy3.collection.list;

import java.util.function.UnaryOperator;

/*
 @Description
 *@author kang.li
 *@date 2021/1/5 9:10   
 */
public class MyOperator implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return (String) (s + "111");
    }
}
