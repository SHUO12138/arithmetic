package com.ws.MyException;

import com.ws.MyArraylist.List;
import com.ws.MyArraylist.MyArrayList;

import java.util.ArrayList;

/**
 * 自定义异常
 * 数组下标越界
 */
public class MyIndexouofBoundsException extends   RuntimeException{

    public MyIndexouofBoundsException() {
        super();
    }

    public MyIndexouofBoundsException(String message) {
        super(message);
    }
}
