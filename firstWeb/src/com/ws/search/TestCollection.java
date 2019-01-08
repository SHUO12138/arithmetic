package com.ws.search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

    public static void main(String[] args) {
        //HashSet  底层HashMap  add  <值，PRESENT>  哈希表
        //    private static final Object PRESENT = new Object();
        Set set=new HashSet();
        set.add("asd");

        //TreeSet  底层TreeMap  红黑树
        Set tree=new TreeSet();
        tree.add("");

        //1.7之前都是 数组加链表
        //1.8 以后 长度超过8 用红黑树提高查询效率
        HashMap map =new HashMap();

    }
}
