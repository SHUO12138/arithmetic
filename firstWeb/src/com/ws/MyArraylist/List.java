package com.ws.MyArraylist;
/**
 *  线性表接口
 * @author SHUO
 */
public interface List {
    //返回线性表的大小，即数据元素个数
    public int size();

    //返回线性表中序号为i的元素
    public Object get(int i);

    //如果线性表为空返回true，否则返回false
    public boolean isEmpty();

    //判断线性表是否包含数据元素e
    public boolean contains(Object e);

    //返回数据元素e在新型表中的位置
    public int indexOf(Object e);

    //将数据元素e插入到线性表i号位置
    public  void add(int i,Object e);

    //将数据元素e插入到线性表末尾
    public  void add(Object e);

    //将数据元素e插入obj之前
    public boolean addBefore(Object obj,Object e);

    //将数据元素e插入obj之后
    public boolean addAfter(Object obj,Object e);

    //删除线性表中序号为i的元素,并返回该元素
    public Object remove(int i);

    //删除线性表中第一个与e相同的元素
    public boolean remove(Object i);

    //替换线性表中序号为i的元素为e 返回原数据元素
    public Object replace(int i,Object obj);

    //替换线性表中e替换为obj
    public boolean replaceAll(int obj,Object e);


}
