package com.ws.search;

/**
 * 功能：二分法查找指定数值
 * 递归
 * 顺序结构  有序
 * T(n)= O(log n)
 * S(n)= O(1*slog n)
 * @author ws
 */
public class TestSearch3 {
    public static void main(String[] args) {
        //给定查找分数数组
        int [] socreArr={1,2,3,4,5,6,7,8,9,10,11};
        //给定要查找的值
        int score =11;
        //完成查找
        int index=getIndexByArr(socreArr,score);

        //输出结果
        if (index == -1){
            System.out.println("要查找内容不存在");
        }else{
            System.out.println(score+"的索引是:"+index);
        }
    }

    public static int getIndexByArr(int [] arr,int key){
        //指定low 和high
        int high = arr.length-1;
        int low = 0;
        //二分查找

        return getIndexByArr(arr,key,low,high);
    } public static int getIndexByArr(int [] arr,int key, int low ,int high){
        int mid = (high+low)/2;
        if (low>=high) {
            return -1;
        }
        if (key==arr[mid]){
            return mid;
        }else if (key>arr[mid]){
            return getIndexByArr(arr,key,mid+1,high);
        }else if (key<arr[mid]){
            return getIndexByArr(arr,key,low,mid-1);
        }
        return -1;
    }
}
