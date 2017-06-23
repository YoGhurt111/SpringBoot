package com.yoghurt.Exception;

/**
 * Created by admin on 2017/6/23.
 */
public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
    MyException(){
        super();
    }
}
