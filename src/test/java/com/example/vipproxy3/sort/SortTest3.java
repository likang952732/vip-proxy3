package com.example.vipproxy3.sort;

/*
 @Description
 *@author kang.li
 *@date 2021/1/5 10:43   
 */
public class SortTest3 {
    public static void main(String[] args) {
        int[] arr = {0,3,5,8,9,11,12};
        int index = middleSort(arr, 11, 0, arr.length);
        System.out.println("index: " + index + "........." + arr[index]);
    }

    public static int middleSort(int[] arr, int value, int low, int high) {
        if(arr == null || low > high)
            return -1;
        int middle = (low + high)/2;
        if(arr[middle] > value) {
            return middleSort(arr, value, low, high-1);
        } else if(arr[middle] < value)
            return middleSort(arr, value, low+1, high);
        return middle;
    }
}
