package com.ws.StackQueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 将十进制转换为为二进制
 */
public class TestConvert {
    public static void main(String[] args) {
        //给定一个进制
        int z=2;//进制不能大于10进制
        //给一个十进制数
        int n=17;
        //把十进制转换成二进制
        int t=n;//被除数
        //定义一个空栈
        Deque stack=new LinkedList();
        do{
            //求余数
            int mod =t % z;
            //输出余数
//            System.out.println(mod);
            stack.push(mod);
            //除以2的商
            //用商做被除数
            t=t/z;
        }while(t>0);
        //输出结果
        System.out.print(n+"----->");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
