package com.ws.MyArraylist;

import com.ws.MyException.MyIndexouofBoundsException;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 顺序表
 * 底层采用数据，但是长度可以动态变化
 * @author SHUO
 *  java底层每次右移一位增长50%
 *  oldCapacity + (oldCapacity >> 1);
 *
 */
public class MyArrayList implements  List{

    private Object[] elementData;//数组
    private  int size;//数组中元素个数


    public MyArrayList(int initialCapacity){
        //给数组分配指定数量的空间
        elementData =new Object[initialCapacity];
        //指定顺序表的元素个数
        //size = 0;
    }

    public MyArrayList(){
        //Arraylist底层默认为0
        //第一次就扩容

        //没有指定长度默认4
        this(4);
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i>=size||i<0){
//            throw  new RuntimeException("数组下标越界异常："+i);
            throw  new MyIndexouofBoundsException("数组下标越界异常："+i);
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        if (i>size||i<0){
//            throw  new RuntimeException("数组下标越界异常："+i);
            throw  new MyIndexouofBoundsException("数组下标越界异常："+i);
        }
        //数组满了就扩容
        if (size == elementData.length){
            grow();
        }

        //从最后一个元素开始移动
        for (int j = size; j > i; j--) {
            elementData[j]=elementData[j-1];
        }
        //给元素赋值  元素个数加1
        elementData[i]=e;
        size++;
    }

    @Override
    public void add(Object e) {
//        //数组满了就扩容
//        if (size == elementData.length){
//            grow();
//        }
//        //给元素赋值  元素个数加1
//        elementData[size++]=e;
        this.add(size,e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object i) {
        return false;
    }

    @Override
    public Object replace(int i, Object obj) {
        return null;
    }

    @Override
    public boolean replaceAll(int obj, Object e) {
        return false;
    }
    //当前数组增长一倍
    //真正底层增长一半
    private void grow(){
        //            //创建一个新数组 长度是原来的二倍
//            Object [] newElementData =new Object[elementData.length*2];
//            //旧数组元素指向新数组
//            for (int i = 0; i < elementData.length; i++) {
//                newElementData[i]=elementData[i];
//            }
//            //旧数组地址指向新数组
//            elementData=newElementData;
        //旧数组扩容并复制
        elementData = Arrays.copyOf(elementData,elementData.length*2);
    }

    @Override
    public String toString() {
        if (size==0){
            return "[]";
        }
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i!=size-1){
            sb.append(elementData[i]+",");
            }else{
                sb.append(elementData[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
