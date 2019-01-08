package com.ws.search;

/**
 * 功能：查找指定数值
 * T(n)= O(n)
 * S(n)= O(1)
 * @author ws
 */
public class TestSearch1 {
    public static void main(String[] args) {
        //给定查找分数数组
        int [] socreArr={89,45,78,45,100,98,86,100,65};
        //给定要查找的值
        int score =100;
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
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]){
                return  i;
            }
        }
        return -1;
    }
}
