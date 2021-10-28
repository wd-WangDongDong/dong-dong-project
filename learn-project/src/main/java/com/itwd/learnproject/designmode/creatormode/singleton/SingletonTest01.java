package com.itwd.learnproject.designmode.creatormode.singleton;

/**
 * @Author: wangdong
 * @Date: 2021/2/19 15:11
 * @Version 1.0
 */
public class SingletonTest01 {
    // 私有化SingletonTest01使其无法new
    private SingletonTest01() {
    }

    private final static SingletonTest01 instance = new SingletonTest01();

    public static SingletonTest01 getInstance(){
        return instance;
    }
}
