package com.ws.sort;

import java.util.Arrays;

/**
 *  * 稳定
 *  * O(n2)
 * 插入排序
 *  1.从数组中取一个元素
 *  2.将这个元素和左边的已经排好序的元素进行对比
 */
public class TestInsertSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr={72,6,57,88,60,42,83,73,48,85};
        //输出无序数据
        System.out.println(Arrays.toString(arr));
        //冒泡排序
        insertSort(arr);
        //输出有序数据
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        //第一个循环充从数组中取出第一个数
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
//            第二次对前i个有序数列循环比较插入最新的数据
            for (int j = i; j>0 ; j--) {
                if (temp<arr[j-1]){
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
    
    

}
