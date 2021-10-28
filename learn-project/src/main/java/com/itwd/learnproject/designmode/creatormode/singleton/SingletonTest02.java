package com.itwd.learnproject.designmode.creatormode.singleton;

/**
 * @Author: wangdong
 * @Date: 2021/2/19 15:11
 * @Version 1.0
 */
public class SingletonTest02 {
    private SingletonTest02() {
    }

    private static SingletonTest02 instance;

    static {
        instance = new SingletonTest02();
    }

    public static SingletonTest02 getInstance(){
        return instance;
    }
}
