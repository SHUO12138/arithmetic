package com.ws.Mylist;

/**
 * 单链表的结点类
 */
public class Node {

    private Object date;

    private Node next;

    public Node(Object date, Node next) {
        this.date = date;
        this.next = next;
    }
     public Node(Object date) {
        this.date = date;
        this.next = next;
    }
    public Node() {
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
