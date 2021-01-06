package com.example.vipproxy3.threadlocal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 @Description 实现线程安全的SimpleDateFormat
 *@author kang.li
 *@date 2021/1/5 15:33   
 */
public class DateUtils {
    public static final ThreadLocal<DateFormat> df = new ThreadLocal() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
}
