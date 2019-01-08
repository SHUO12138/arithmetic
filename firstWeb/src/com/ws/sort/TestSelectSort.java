package com.ws.sort;

import java.util.Arrays;

/**
 * 稳定
 * O(n2)
 * 选择排序
 * 原理
 * 每次循环选出最小（大）和最左(右)交换
 *
 */
public class TestSelectSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr={72,6,57,88,60,42,83,73,48,85};
        //输出无序数据
        System.out.println(Arrays.toString(arr));
        //冒泡排序
        selectSort(arr);
        //输出有序数据
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
//                将每次的最小放在新数组最右边 arr[i]
                if (arr[j]<arr[i]){
//                    交换
//                    这里可以提取出一个公共的交换方法
                    swap(arr,i,j);
                }

            }

        }
    }

    public static void swap(int[] arr, int i, int j) {
        //交换xy值 x=x+y  y=x-y x=x-y
        //减少空间复杂度
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }

}
