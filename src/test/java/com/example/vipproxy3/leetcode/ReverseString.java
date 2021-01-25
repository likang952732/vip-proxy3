package com.example.vipproxy3.leetcode;

/*
 @Description 反转字符串 如hello 输出olleh
 *@author kang.li
 *@date 2021/1/6 9:53   
 */
public class ReverseString {
    public static void main(String[] args){
        String str = "abcd";
        String reverseStr = reverse3(str);
        System.out.println(reverseStr);
    }

    public static String reverse(String str){
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static String reverse2(String str){
        return new StringBuilder().reverse().toString();
    }

    public static String reverse3(String str){
        char[] chars = str.toCharArray();
        int length = str.length();
        char temp;
        for (int i = 0, j = length-1; i < length/2; i++,j--){
           temp = chars[i];
           chars[i] = chars[j];
           chars[j] = temp;
        }
        return new String(chars);
    }
}
