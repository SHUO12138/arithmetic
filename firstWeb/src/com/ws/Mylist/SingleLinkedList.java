package com.ws.Mylist;
import com.ws.MyException.MyIndexouofBoundsException;

public class SingleLinkedList implements List    {
    private Node head=new Node();//头结点，不存数据，为了编程方便

    private int size;
    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size==0){
            return "[]";
        }
        Node p=head.getNext();
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i!=size-1){
                sb.append(p.getDate()+",");
            }else{
                sb.append(p.getDate());
            }
            p=p.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object get(int i) {
        //和顺序表不同 不能通过索引计算定位 只能一个一个找
        Node p=head;
        for (int j = 0; j <= i; j++) {
            p=p.getNext();
        }
        return p.getDate();
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
        return this.indexOf(e) >-1;
    }

    @Override
    public int indexOf(Object e) {
        Node p=head;
        for (int j = 0; j < size; j++) {
                p=p.getNext();
                if (p.getDate().equals(e)){
                    return j;
                }
        }
        return -1;
    }

    @Override
    public void add(int i, Object e) {
        if(i<0||i>size){
            throw new MyIndexouofBoundsException("数组下标越界");
        }
        //找到前一个结点，从head结点开始找
        Node p=head;
        for (int j = 0; j < i; j++) {
            p=p.getNext();
        }
        //新创建一个结点
        Node newNode= new Node(e);
        //新结点指向新结点直接后继
        newNode.setNext(p.getNext());
        //新结点的前驱改为新结点地址
        p.setNext(newNode);
        size++;
    }

    @Override
    public void add(Object e) {
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
        if(i<0||i>size){
            throw new MyIndexouofBoundsException("数组下标越界");
        }
        return null;
    }

    @Override
    public boolean remove(Object i) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public int replaceAll(Object obj, Object e) {
        return 0;
    }
}
