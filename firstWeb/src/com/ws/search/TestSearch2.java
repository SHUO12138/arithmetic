package com.ws.search;

/**
 * 功能：二分法查找指定数值
 * 顺序结构  有序
 * T(n)= O(log n)
 * S(n)= O(1)
 * @author ws
 */
public class TestSearch2 {
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

        while (high>=low){
            int mid = (high+low)/2;
            if (key==arr[mid]){
                return mid;
            }else if (key>arr[mid]){
                low =mid+1;
            }else if (key<arr[mid]){
                high =mid-1;
            }
        }
        return -1;
    }
}
