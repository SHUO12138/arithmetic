package com.ws.sort;

import java.util.Arrays;

/**
 *  * 稳定
 *  * O(n2)
 * 冒泡排序
 * 原理
 * 每一次将最大的元素挪到最右边
 * （1）比较相邻的元素。如果第一个比第二个大，就交换它们两个。
 *
 * （2）对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。
 *
 * （3）针对所有的元素重复以上的步骤，除了最后一个。
 *
 * （4）持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class TestBubbleSort {

    public static void main(String[] args) {
        //给出无序数组
        int [] arr={72,6,57,88,60,42,83,73,48,85};
        //输出无序数据
        System.out.println(Arrays.toString(arr));
        //冒泡排序
        bubbleSort(arr);
        //输出有序数据
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
    //
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
//                如果左边比右边大 交换
                if (arr[j]>arr[j+1]){
                    int x=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=x;
                }
            }
        }


    }
}
