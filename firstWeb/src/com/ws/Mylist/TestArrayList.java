package com.ws.Mylist;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
       List mlist=new  MyArrayList();
        ArrayList list;
        mlist.add("123");
        mlist.add("345");
        mlist.add("789");
        mlist.add("0");
        System.out.println(mlist.size());
        mlist.add("22123");
        mlist.add("22345");
        mlist.add("22789");
        mlist.add("220");
        mlist.add(1,"220");
        System.out.println(mlist.size());
        System.out.println(mlist.get(1));
        System.out.println(mlist.isEmpty());
        System.out.println(mlist.contains("220"));
        System.out.println(mlist.indexOf("220"));
        System.out.println(mlist.remove(1));
        System.out.println(mlist.remove("220"));
        System.out.println(mlist.indexOf("220"));
        mlist.add("220");
        mlist.add("220");
        System.out.println(mlist);
        System.out.println(mlist.replaceAll("220","111"));
        System.out.println(mlist);

    }
}
