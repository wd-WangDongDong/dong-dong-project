package com.itwd.learnproject.designmode.creatormode.singleton;

/**
 * @Author: wangdong
 * @Date: 2021/2/19 15:11
 * @Version 1.0
 */
public class SingletonTest04 {
    private SingletonTest04() {
    }

    private static SingletonTest04 instance;
    // 用到该方法时 才去创建
    public static synchronized SingletonTest04 getInstance(){
        if(instance == null){
            instance = new SingletonTest04();
        }
        return instance;
    }
}
