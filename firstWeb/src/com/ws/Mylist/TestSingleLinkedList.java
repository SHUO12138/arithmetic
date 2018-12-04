package com.ws.Mylist;

import java.util.ArrayList;

public class TestSingleLinkedList {
    public static void main(String[] args) {
       List mlist=new SingleLinkedList();

        mlist.add("123");
        mlist.add("345");
        mlist.add("789");
        mlist.add("0");
        mlist.add("01");
        mlist.add(2,"333");
        System.out.println(mlist.size());
        System.out.println(mlist.get(2));
//        System.out.println(mlist.isEmpty());
        System.out.println(mlist.contains("333"));
        System.out.println(mlist.indexOf("333"));
        System.out.println(mlist);
//        System.out.println(mlist.replaceAll("220","111"));
//        System.out.println(mlist);

    }
}
