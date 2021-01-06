package com.example.vipproxy3.sort;

import java.util.Arrays;

/*
 @Description
 *@author kang.li
 *@date 2021/1/5 9:51   
 */
public class SortTest1 {
    public static void main(String[] args) {
        int[] arr = {8,2,1,11,0,5,3};
        bubbingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbingSort(int[] arr) {
        if(arr == null)
            return;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }
        }
    }
}
