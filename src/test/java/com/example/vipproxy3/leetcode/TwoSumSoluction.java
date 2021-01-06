package com.example.vipproxy3.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 @Description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标
 *@author kang.li
 *@date 2021/1/6 9:40   
 */
public class TwoSumSoluction {
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1,4,5,2,8,9};
        soluction(arr, 9);
        list.stream().forEach(System.out::println);
    }

    public static void soluction(int[] arr, int target) {
        int num1 = 0,num2 = 0, temp = 0;
        for (int i = 0; i < arr.length; i++){
           for (int j = 0; j < i; j++){
              if (i == j)
                  continue;
               num1 = arr[i];
               num2 = arr[j];
               temp = arr[i] + arr[j];
               if(temp == target) {
                   list.add(i);
                   list.add(j);
               }
           }
        }
    }
}
