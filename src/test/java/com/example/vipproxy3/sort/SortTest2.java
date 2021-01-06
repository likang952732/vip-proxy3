package com.example.vipproxy3.sort;

import java.util.Arrays;

/*
 @Description 快速排序
 *@author kang.li
 *@date 2021/1/5 10:04   
 */
public class SortTest2 {
    public static void main(String[] args) {
        int[] arr = {9,4,7,1,0,5,3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
       if(arr == null || low < 0 || low > high)
           return;
        int i = low;
        int j = high;
        int temp = arr[low];
        while (i < j) {
           while (i < j && temp <= arr[j]) {
               j--;
           }
           while (i < j && temp >= arr[i]) {
               i++;
           }
           int t = arr[i];
           arr[i] = arr[j];
           arr[j] = t;
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }
}
