package com.ws.MyException;

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
